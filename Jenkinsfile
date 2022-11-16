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
      stage('Publish to Nexus') {
                     steps {
                         script {
                                sh 'mvn deploy -e -DskipTests'
                                echo 'Publish to Nexus'

                     }
                 }
                 }
       /*stage('build docker image') {
            steps {
                script {
                    sh 'docker build -t $DOCKER_LOGIN/devops .'
                    echo 'build docker image'
                    }
                    }
             }
       stage('Docker login') {
                steps {
                    sh 'docker login -u $DOCKER_LOGIN -p $DOCKER_PASSWORD'
                    echo 'Docker login'

                     }
                    }
       stage('Pushing Docker Image') {
                steps {
                      sh 'docker push $DOCKER_LOGIN/devops'
                       echo 'Pushing Docker Image'
                       }
                     }
       stage('Run Spring && MySQL Containers') {
                 steps {
                   sh 'docker-compose down'

                   sh 'docker-compose up -d'

                   echo 'Run Spring && MySQL Containers'
                        }
                    }*/
}

}
