
package utils;

import weka.classifiers.Evaluation;

public class Metrics {
    public static void printEvaluation(Evaluation eval) throws Exception {
        System.out.println("=== Evaluation Metrics ===");
        System.out.println("Accuracy  : " + (1 - eval.errorRate()));
        System.out.println("Precision : " + eval.precision(1));
        System.out.println("Recall    : " + eval.recall(1));
        System.out.println("F1-Score  : " + eval.fMeasure(1));
        System.out.println(eval.toSummaryString());
    }
}
