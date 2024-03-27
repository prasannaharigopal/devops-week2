pipeline {
    agent any
    
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
