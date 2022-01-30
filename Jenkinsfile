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
                sh './mvnw clean install'
            }
        }
        stage('deploy') {
            steps {
                sh navigate: 'cd ./target',
                        run: 'java -jar ./jenkins-file-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
