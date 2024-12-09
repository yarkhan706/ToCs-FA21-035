pipeline {
    agent any

    stages {
        stage('Build and Run') {
            steps {
                // Compile the Java file
                sh 'javac SquareCalculator.java'
                
                // Execute the Java program with input
                sh 'echo "5" | java SquareCalculator'
            }
        }
    }
}
