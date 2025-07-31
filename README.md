# 📧 Spam Email Detection using Java & Weka

An ML-based spam classifier implemented in **Java**, using **Weka’s Naive Bayes** algorithm and trained on the **Spambase dataset**. This project demonstrates how machine learning models can be integrated into Java applications for effective email spam detection.

---

## 🧠 Overview

This project uses **Weka's Naive Bayes classifier** to detect spam emails using **numeric features** from the Spambase dataset. The dataset is converted to ARFF format and used to train and evaluate a classifier within a modular Java application.

---

## 📁 Folder Structure

```
project-root/
├── src/                      # Java source code (modularized)
│   └── Main.java             # Entry point for classifier execution
├── resources/
│   └── spambase.arff         # Dataset file in ARFF format
├── weka.jar                  # Weka library (not included, download separately)
└── README.md                 # Project documentation
```

---

## 📦 Dependencies

- Java Development Kit (JDK 8+)
- Weka Machine Learning Library (`weka.jar`)
- Spambase Dataset (converted to ARFF format)

---

## ⚙️ How to Run

### Step 1: Add Weka to Classpath

Make sure `weka.jar` is available in the project directory or referenced in your build path.

### Step 2: Compile the Source

For **Windows**:
```sh
javac -cp .;weka.jar src/**/*.java
```

For **Linux/macOS**:
```sh
javac -cp .:weka.jar src/**/*.java
```

### Step 3: Execute the Classifier

For **Windows**:
```sh
java -cp .;weka.jar src.Main
```

For **Linux/macOS**:
```sh
java -cp .:weka.jar src.Main
```

---

## 📊 Output

The program will print performance metrics based on 10-fold cross-validation:
- ✅ Accuracy
- 📌 Precision
- 🔁 Recall
- 🧮 F1-Score

---

## 📈 Future Enhancements

- Integrate other classifiers (SVM, Random Forest, J48)
- Implement a GUI using JavaFX or Swing
- Real-time spam filtering using email clients (IMAP/SMTP)
- Visualize classifier performance and feature contribution

---

## 📝 License

This project is licensed under the MIT License.

---

## 👤 Author

kunisetti sudhakar 
GitHub:https://github.com/sudhakar-114  
Email: kunisettisudhakar114@gmail.com

---

## 🙏 Acknowledgements

- [Weka Machine Learning Toolkit](https://www.cs.waikato.ac.nz/ml/weka/)
- [UCI ML Repository - Spambase Dataset](https://archive.ics.uci.edu/ml/datasets/spambase)
