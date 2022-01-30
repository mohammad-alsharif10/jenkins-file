pipeline {
    agent any

    stages {
        stage('check-out') {
            steps {
                git branch: 'stable-2.204',
                        url: 'https://github.com/jenkinsci/jenkins.git'
            }
        }
        stage('build') {
            steps {
                sh './mvnw clean install'
            }
        }
        stage('deploy') {
            steps {
                sh navigate: 'cd ./target',
                        deploy: 'java -jar ./jenkins-file-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
