package br.ufrpe.metamorphic;

import br.ufrpe.metamorphic.util.DataImport;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Utils;
import weka.core.converters.CSVLoader;


import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Normalize;

import java.util.Arrays;
import java.util.Random;
import java.io.*;

/**
 * Created by CaioViana on 03/11/2024.
 */
public class WekaMultiLayerPerceptron {

    private static final String OJOSECO_FILEPATH = "./dataset/AllTags.csv";
    private static final double RATIO_TEST = 0.66;

    public Double evaluationModel(MultilayerPerceptron mlp, Instances test){
        try {
            Evaluation eval = new Evaluation(test);
            eval.evaluateModel(mlp, test);
            System.out.println(Arrays.deepToString(eval.confusionMatrix()).replace("],","\n").replace(",","\t\t| ")
                    .replaceAll("[\\[\\]]", " "));

            System.out.println(eval.toSummaryString());
            return eval.weightedTruePositiveRate();

        }catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    public Double build(int nFile) {
        try {

            CSVLoader loader = new CSVLoader();
            loader.setSource(new File(OJOSECO_FILEPATH));

            CSVLoader loaderTraining = new CSVLoader();

            if(nFile == 5) {
                loaderTraining.setSource(new File("./dataset/noised_5_percent.csv"));
            }if(nFile == 6) {
                loaderTraining.setSource(new File("./dataset/noised_6_percent.csv"));
            }if(nFile == 7) {
                loaderTraining.setSource(new File("./dataset/noised_7_percent.csv"));
            }if(nFile == 10) {
                loaderTraining.setSource(new File("./dataset/noised_10_percent.csv"));
            }if(nFile == 20) {
                loaderTraining.setSource(new File("./dataset/noised_20_percent.csv"));
            }if(nFile == 30) {
                loaderTraining.setSource(new File("./dataset/noised_30_percent.csv"));
            }if(nFile == 40) {
                loaderTraining.setSource(new File("./dataset/noised_40_percent.csv"));
            }if(nFile == 60) {
                loaderTraining.setSource(new File("./dataset/noised_60_percent.csv"));
            }if(nFile == 0) {
                loaderTraining.setSource(new File(OJOSECO_FILEPATH));
            }

            Instances data = loader.getDataSet();
            Instances dataTest = loaderTraining.getDataSet();

            Normalize normalize = new Normalize();
            normalize.setInputFormat(data);

            Normalize normalizeTraining = new Normalize();
            normalizeTraining.setInputFormat(dataTest);

            data = Filter.useFilter(data, normalize);
            dataTest = Filter.useFilter(dataTest, normalize);

            data.setClassIndex(data.numAttributes() - 1); //Setado a posição da Classe (ultima posicao)
            dataTest.setClassIndex(dataTest.numAttributes() - 1);


            System.out.println("===========================");
            System.out.println("===========================");


            System.out.println("DATA");
            System.out.println(data.toSummaryString());
            System.out.println("DATA TEST");
            System.out.println(dataTest.toSummaryString());

            System.out.println("===========================");
            System.out.println("===========================");


            //Metodo Random
            data.randomize(new Random(0));
            //Setando o local para "cisao" e teste
            int trainSize = Math.toIntExact(Math.round(data.numInstances() * RATIO_TEST));
            int testSize = data.numInstances() - trainSize;

            Instances train = new Instances(data, 0, trainSize);
            Instances test = new Instances(dataTest, trainSize, testSize);

            MultilayerPerceptron mlp = new MultilayerPerceptron();
            mlp.setOptions(Utils.splitOptions("-L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a"));
            mlp.buildClassifier(train);

            System.out.println(mlp.toString());

            return this.evaluationModel(mlp, test);




        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }

    }
}