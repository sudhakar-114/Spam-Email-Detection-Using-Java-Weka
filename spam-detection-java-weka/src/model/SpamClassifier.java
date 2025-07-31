
package model;

import utils.Metrics;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.Evaluation;
import weka.core.Instances;
import java.util.Random;

public class SpamClassifier {
    private Classifier classifier;

    public void train(Instances data) throws Exception {
        classifier = new NaiveBayes(); // or use new RandomForest();
        classifier.buildClassifier(data);
    }

    public void evaluate(Instances data) throws Exception {
        Evaluation eval = new Evaluation(data);
        eval.crossValidateModel(classifier, data, 10, new Random(1));
        Metrics.printEvaluation(eval);
    }
}
