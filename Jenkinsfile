pipeline {
    agent any
 
    tools {
        jdk "java-jdk"
        maven "maven"
    }
 
    stages {
        stage('Build') {
            steps {
                // Checkout source code from Git repository
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '', url: '']])
                // Build the project
                bat 'mvn clean package'
            }
        }
 
        stage('Test') {
            steps {
                // Run tests
                bat 'mvn test'
            }
        }
    }
}
