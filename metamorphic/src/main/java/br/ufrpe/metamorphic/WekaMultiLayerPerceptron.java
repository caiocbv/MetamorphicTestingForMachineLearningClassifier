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
            if(nFile == 10) {
                loader.setSource(new File("./dataset/noised_10_percent.csv"));
            }if(nFile == 20) {
                loader.setSource(new File("./dataset/noised_20_percent.csv"));
            }if(nFile == 30) {
                loader.setSource(new File("./dataset/noised_30_percent.csv"));
            }if(nFile == 40) {
                loader.setSource(new File("./dataset/noised_40_percent.csv"));
            }if(nFile == 60) {
                loader.setSource(new File("./dataset/noised_60_percent.csv"));
            }if(nFile == 0) {
                loader.setSource(new File(OJOSECO_FILEPATH));
            }

            Instances data = loader.getDataSet();

            Normalize normalize = new Normalize();
            normalize.setInputFormat(data);
            data = Filter.useFilter(data, normalize);

            data.setClassIndex(data.numAttributes() - 1); //Setado a posição da Classe

            System.out.println(data.toSummaryString());



            data.randomize(new Random(0));

            int trainSize = Math.toIntExact(Math.round(data.numInstances() * RATIO_TEST));
            int testSize = data.numInstances() - trainSize;

            Instances train = new Instances(data, 0, trainSize);
            Instances test = new Instances(data, trainSize, testSize);

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