
import data.EmailPreprocessor;
import model.SpamClassifier;
import utils.Metrics;
import weka.core.Instances;

public class Main {
    public static void main(String[] args) throws Exception {
        String datasetPath = "resources/spambase.arff";
        Instances data = EmailPreprocessor.loadDataset(datasetPath);
        SpamClassifier classifier = new SpamClassifier();
        classifier.train(data);
        classifier.evaluate(data);
    }
}
