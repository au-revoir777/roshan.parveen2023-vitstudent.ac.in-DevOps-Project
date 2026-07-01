pipeline {

    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/au-revoir777/roshan.parveen2023-vitstudent.ac.in-DevOps-Project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t website .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'kubectl apply -f k8s/deployment.yaml'
                sh 'kubectl apply -f k8s/service.yaml'
            }
        }

    }
}