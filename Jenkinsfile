pipeline {
    agent any

    tools {
        maven 'Maven'   // Ensure this matches the Maven tool name configured in Jenkins
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/Harshini-Medha/mavensele.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Run Application') { steps { sh 'mvn exec:java -Dexec.mainClass="com.example.App"' } } 

    post {
        success {
            echo 'Build and deployment successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
