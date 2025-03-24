package br.ufrpe.metamorphic;

import br.ufrpe.metamorphic.util.DataImport;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.classifiers.lazy.IBk;
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
public class WekaKNN {

    private static final String OJOSECO_FILEPATH = "./dataset/AllTags.csv";
    private static final double RATIO_TEST = 0.66;

    public Double evaluationModel(IBk ibk, Instances test){
        try {
            Evaluation eval = new Evaluation(test);
            eval.evaluateModel(ibk, test);
            System.out.println(Arrays.deepToString(eval.confusionMatrix()).replace("],","\n").replace(",","\t\t| ")
                    .replaceAll("[\\[\\]]", " "));

            System.out.println(eval.toSummaryString());
            return eval.weightedTruePositiveRate();

        }catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    public Double build(Double nFile) {
        try {

            CSVLoader loader = new CSVLoader();
            loader.setSource(new File(OJOSECO_FILEPATH));

            CSVLoader loaderTraining = new CSVLoader();

            if(nFile == 1.5625) {
                loaderTraining.setSource(new File("./dataset/noised_1.5625_percent.csv"));
            }
            if(nFile == 3.125) {
                loaderTraining.setSource(new File("./dataset/noised_3.125_percent.csv"));
            }
            if(nFile == 4.6875) {
                loaderTraining.setSource(new File("./dataset/noised_4.6875_percent.csv"));
            }
            if(nFile == 6.25) {
                loaderTraining.setSource(new File("./dataset/noised_6.25_percent.csv"));
            }
            if(nFile == 7.8125) {
                loaderTraining.setSource(new File("./dataset/noised_7.8125_percent.csv"));
            }
            if(nFile == 9.375) {
                loaderTraining.setSource(new File("./dataset/noised_9.375_percent.csv"));
            }
            if(nFile == 10.9375) {
                loaderTraining.setSource(new File("./dataset/noised_10.9375_percent.csv"));
            }
            if(nFile == 12.5) {
                loaderTraining.setSource(new File("./dataset/noised_12.5_percent.csv"));
            }
            if(nFile == 14.0625) {
                loaderTraining.setSource(new File("./dataset/noised_14.0625_percent.csv"));
            }
            if(nFile == 15.625) {
                loaderTraining.setSource(new File("./dataset/noised_15.625_percent.csv"));
            }
            if(nFile == 17.1875) {
                loaderTraining.setSource(new File("./dataset/noised_17.1875_percent.csv"));
            }
            if(nFile == 18.75) {
                loaderTraining.setSource(new File("./dataset/noised_18.75_percent.csv"));
            }
            if(nFile == 20.3125) {
                loaderTraining.setSource(new File("./dataset/noised_20.3125_percent.csv"));
            }
            if(nFile == 21.875) {
                loaderTraining.setSource(new File("./dataset/noised_21.875_percent.csv"));
            }
            if(nFile == 23.4375) {
                loaderTraining.setSource(new File("./dataset/noised_23.4375_percent.csv"));
            }
            if(nFile == 25) {
                loaderTraining.setSource(new File("./dataset/noised_25_percent.csv"));
            }
            if(nFile == 26.5625) {
                loaderTraining.setSource(new File("./dataset/noised_26.5625_percent.csv"));
            }
            if(nFile == 28.125) {
                loaderTraining.setSource(new File("./dataset/noised_28.125_percent.csv"));
            }
            if(nFile == 29.6875) {
                loaderTraining.setSource(new File("./dataset/noised_29.6875_percent.csv"));
            }
            if(nFile == 31.25) {
                loaderTraining.setSource(new File("./dataset/noised_31.25_percent.csv"));
            }
            if(nFile == 32.8125) {
                loaderTraining.setSource(new File("./dataset/noised_32.8125_percent.csv"));
            }
            if(nFile == 34.375) {
                loaderTraining.setSource(new File("./dataset/noised_34.375_percent.csv"));
            }
            if(nFile == 35.9375) {
                loaderTraining.setSource(new File("./dataset/noised_35.9375_percent.csv"));
            }
            if(nFile == 37.5) {
                loaderTraining.setSource(new File("./dataset/noised_37.5_percent.csv"));
            }
            if(nFile == 39.0625) {
                loaderTraining.setSource(new File("./dataset/noised_39.0625_percent.csv"));
            }
            if(nFile == 40.625) {
                loaderTraining.setSource(new File("./dataset/noised_40.625_percent.csv"));
            }
            if(nFile == 42.1875) {
                loaderTraining.setSource(new File("./dataset/noised_42.1875_percent.csv"));
            }
            if(nFile == 43.75) {
                loaderTraining.setSource(new File("./dataset/noised_43.75_percent.csv"));
            }
            if(nFile == 45.3125) {
                loaderTraining.setSource(new File("./dataset/noised_45.3125_percent.csv"));
            }
            if(nFile == 46.875) {
                loaderTraining.setSource(new File("./dataset/noised_46.875_percent.csv"));
            }
            if(nFile == 48.4375) {
                loaderTraining.setSource(new File("./dataset/noised_48.4375_percent.csv"));
            }
            if(nFile == 50) {
                loaderTraining.setSource(new File("./dataset/noised_50_percent.csv"));
            }
            if(nFile == 51.5625) {
                loaderTraining.setSource(new File("./dataset/noised_51.5625_percent.csv"));
            }
            if(nFile == 53.125) {
                loaderTraining.setSource(new File("./dataset/noised_53.125_percent.csv"));
            }
            if(nFile == 54.6875) {
                loaderTraining.setSource(new File("./dataset/noised_54.6875_percent.csv"));
            }
            if(nFile == 56.25) {
                loaderTraining.setSource(new File("./dataset/noised_56.25_percent.csv"));
            }
            if(nFile == 57.8125) {
                loaderTraining.setSource(new File("./dataset/noised_57.8125_percent.csv"));
            }
            if(nFile == 59.375) {
                loaderTraining.setSource(new File("./dataset/noised_59.375_percent.csv"));
            }
            if(nFile == 60.9375) {
                loaderTraining.setSource(new File("./dataset/noised_60.9375_percent.csv"));
            }
            if(nFile == 62.5) {
                loaderTraining.setSource(new File("./dataset/noised_62.5_percent.csv"));
            }
            if(nFile == 64.0625) {
                loaderTraining.setSource(new File("./dataset/noised_64.0625_percent.csv"));
            }
            if(nFile == 65.625) {
                loaderTraining.setSource(new File("./dataset/noised_65.625_percent.csv"));
            }
            if(nFile == 67.1875) {
                loaderTraining.setSource(new File("./dataset/noised_67.1875_percent.csv"));
            }
            if(nFile == 68.75) {
                loaderTraining.setSource(new File("./dataset/noised_68.75_percent.csv"));
            }
            if(nFile == 70.3125) {
                loaderTraining.setSource(new File("./dataset/noised_70.3125_percent.csv"));
            }
            if(nFile == 71.875) {
                loaderTraining.setSource(new File("./dataset/noised_71.875_percent.csv"));
            }
            if(nFile == 73.4375) {
                loaderTraining.setSource(new File("./dataset/noised_73.4375_percent.csv"));
            }
            if(nFile == 75) {
                loaderTraining.setSource(new File("./dataset/noised_75_percent.csv"));
            }
            if(nFile == 76.5625) {
                loaderTraining.setSource(new File("./dataset/noised_76.5625_percent.csv"));
            }
            if(nFile == 78.125) {
                loaderTraining.setSource(new File("./dataset/noised_78.125_percent.csv"));
            }
            if(nFile == 79.6875) {
                loaderTraining.setSource(new File("./dataset/noised_79.6875_percent.csv"));
            }
            if(nFile == 81.25) {
                loaderTraining.setSource(new File("./dataset/noised_81.25_percent.csv"));
            }
            if(nFile == 82.8125) {
                loaderTraining.setSource(new File("./dataset/noised_82.8125_percent.csv"));
            }
            if(nFile == 84.375) {
                loaderTraining.setSource(new File("./dataset/noised_84.375_percent.csv"));
            }
            if(nFile == 85.9375) {
                loaderTraining.setSource(new File("./dataset/noised_85.9375_percent.csv"));
            }
            if(nFile == 87.5) {
                loaderTraining.setSource(new File("./dataset/noised_87.5_percent.csv"));
            }
            if(nFile == 89.0625) {
                loaderTraining.setSource(new File("./dataset/noised_89.0625_percent.csv"));
            }
            if(nFile == 90.625) {
                loaderTraining.setSource(new File("./dataset/noised_90.625_percent.csv"));
            }
            if(nFile == 92.1875) {
                loaderTraining.setSource(new File("./dataset/noised_92.1875_percent.csv"));
            }
            if(nFile == 93.75) {
                loaderTraining.setSource(new File("./dataset/noised_93.75_percent.csv"));
            }
            if(nFile == 95.3125) {
                loaderTraining.setSource(new File("./dataset/noised_95.3125_percent.csv"));
            }
            if(nFile == 96.875) {
                loaderTraining.setSource(new File("./dataset/noised_96.875_percent.csv"));
            }
            if(nFile == 98.4375) {
                loaderTraining.setSource(new File("./dataset/noised_98.4375_percent.csv"));
            }
            if(nFile == 100) {
                loaderTraining.setSource(new File("./dataset/noised_100_percent.csv"));
            }
            if(nFile == 0) {
                loaderTraining.setSource(new File(OJOSECO_FILEPATH));
            }

            Instances data = loader.getDataSet();
            Instances dataTest = loaderTraining.getDataSet();

            //Normalize normalize = new Normalize();
            //normalize.setInputFormat(data);

            //Normalize normalizeTraining = new Normalize();
            //normalizeTraining.setInputFormat(dataTest);

            //data = Filter.useFilter(data, normalize);
            //dataTest = Filter.useFilter(dataTest, normalize);

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

            IBk ibk = new IBk();
            ibk.setOptions(Utils.splitOptions("weka.classifiers.lazy.IBk -K 1 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\"\""));
            ibk.buildClassifier(train);

            System.out.println(ibk.toString());

            return this.evaluationModel(ibk, test);




        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }

    }
}
