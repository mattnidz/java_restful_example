pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                //echo 'Building ...'
                bat ".\\mvnw package"
            }
        }
        
        stage('Unit Test') {
            steps {
                //echo 'Unit Testing ...'
                bat '.\\mvnw.cmd test'
                //junit allowEmptyResults: true, testResults: '**/target/surefire-reports/TEST-*.xml'
            }
        }

        stage('Integration Test') {
            steps {
                bat '.\\mvnw verify -DskipUnitTests'
            }
        }

        // stage('Deploy') {
        //     steps {
        //         echo 'Deploying ...'
        //     }
        // }

        
    }
}