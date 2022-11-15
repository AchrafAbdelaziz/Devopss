pipeline {
    agent any
        environment{
        SONAR_LOGIN= 'd3aa8d979da466377d8bc2e16460ac7f59b74add'
        SONAR_KEY = 'devops'
        SONAR_URL = 'http://localhost:9000'
        DOCKER_LOGIN = 'wissemellafi'
        DOCKER_PASSWORD = 'abcd1957wissem'
        }



    stages {
        stage('clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('build') {
                    steps {
                        sh 'mvn package -DskipTests'
                    }
                }
       
      stage('sonar') {
            steps {
                sh 'mvn sonar:sonar -Dsonar.host.url=$SONAR_URL -Dsonar.login=$SONAR_LOGIN -Dsonar.projectKey=$SONAR_KEY'
            }
        }
}

}
