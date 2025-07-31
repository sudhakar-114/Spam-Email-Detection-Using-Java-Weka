
package data;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class EmailPreprocessor {
    public static Instances loadDataset(String path) throws Exception {
        DataSource source = new DataSource(path);
        Instances data = source.getDataSet();
        if (data.classIndex() == -1)
            data.setClassIndex(data.numAttributes() - 1);
        return data;
    }
}
