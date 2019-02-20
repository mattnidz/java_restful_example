pipeline {
    agent any

    options {
        disableConcurrentBuilds()
        buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    tools {
        maven 'M3'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building ...'
                sh 'mvn -B package'
            }
        }
        
        stage('Unit Test') {
            steps {
                echo 'Unit Testing ...'
                sh 'mvn test'
            }
        }

        stage('Integration Test') {
            steps {
                sh 'mvn verify -DskipUnitTests'
            }
        }

        // stage('Deploy') {
        //     steps {
        //         echo 'Deploying ...'
        //     }
        // }

        post {
            always {
                // Archive Unit and integration test results
                junit allowEmptyResults: true,
                        testResults: '**/target/surefire-reports/TEST-*.xml, **/target/failsafe-reports/*.xml'
                mailIfStatusChanged env.EMAIL_RECIPIENTS
            }
        }
    }
}