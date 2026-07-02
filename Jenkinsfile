pipeline {

    agent any
    tools {
        jdk 'JDK25'
        maven 'Maven-3.9.16'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t website:latest .'
            }
        }

        stage('Deploy') {
            steps {
                bat 'kubectl apply -f k8s/mysql-pvc.yaml'
                bat 'kubectl apply -f k8s/mysql-deployment.yaml'
                bat 'kubectl apply -f k8s/mysql-service.yaml'
                bat 'kubectl apply -f k8s/deployment.yaml'
                bat 'kubectl apply -f k8s/service.yaml'
            }
        }

    }
}