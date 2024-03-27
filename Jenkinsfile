pipeline {
    agent any

    tools {
        // Use the Java and Maven installations configured globally in Jenkins
        jdk 'JAVA_HOME'
        maven 'Maven'
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
