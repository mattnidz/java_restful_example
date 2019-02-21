pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building ...'
                //bat "mvn package"
                sh "mvn package"
            }
        }
        
        stage('Unit Test') {
            steps {
                echo 'Unit Testing ...'
                //bat 'mvn test'
                sh 'mvn test'
                //junit allowEmptyResults: true, testResults: '**/target/surefire-reports/TEST-*.xml'
            }
        }

        stage('Integration Test') {
            steps {
                echo 'Integration Testing ...'
                //bat 'mvn verify -DskipUnitTests'
                sh 'mvn verify -DskipUnitTests'
            }
        }

        // stage('Deploy') {
        //     steps {
        //         echo 'Deploying ...'
        //     }
        // }

        
    }
}