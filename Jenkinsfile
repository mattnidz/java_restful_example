pipeline {
    agent any

    options {
        disableConcurrentBuilds()
        buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building ...'
                sh './mvnw -B package'
            }
        }
        
        stage('Unit Test') {
            steps {
                echo 'Unit Testing ...'
                sh './mvnw test'
                junit allowEmptyResults: true, testResults: '**/target/surefire-reports/TEST-*.xml'
            }
        }

        stage('Integration Test') {
            steps {
                sh './mvnw verify -DskipUnitTests'
            }
        }

        // stage('Deploy') {
        //     steps {
        //         echo 'Deploying ...'
        //     }
        // }

        
    }
}