pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Clone the GitHub repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Compile the Java program
                sh 'javac SquareCalculator.java'
            }
        }

        stage('Execute') {
            steps {
                // Run the Java program and provide input
                sh 'echo "5" | java SquareCalculator'
            }
        }
    }

    post {
        always {
            // Print console output or cleanup if needed
            echo 'Pipeline finished!'
        }
    }
}
