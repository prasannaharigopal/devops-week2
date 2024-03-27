pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
                echo " Build success"
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
                echo " testcases succedded"
            }
        }
    }
}
