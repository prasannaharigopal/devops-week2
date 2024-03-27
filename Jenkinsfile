pipeline {
    agent any
    environment {
        // Define environment variables, including paths to Java and Maven
        JAVA_HOME = 'C:/.Net & Java Software/Open JKD -11'
        
    }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
                echo " Build success"
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                echo " testcases succedded"
            }
        }
    }
}
