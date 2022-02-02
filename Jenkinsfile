pipeline {
    agent any

    stages {
//        stage('check-out') {
//            steps {
//                git branch: 'master',
//                        url: 'https://github.com/mohammad-alsharif10/jenkins-file.git'
//            }
//        }
        stage('build') {
            steps {
                bat './mvnw clean install'
            }
        }
        stage('deploy') {
            steps {
                bat 'java -jar target/jenkins-file-0.0.1-SNAPSHOT.jar  &'
            }
        }
    }
}

