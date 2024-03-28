pipeline {
    agent any
 
    tools {
        jdk "JAVA_HOME"
        maven "MAVEN"
    }
 
    stages {
        stage('Build') {
            steps {
                // Checkout source code from Git repository
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
