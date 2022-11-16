FROM maven:3.8.2-jdk-8
RUN apt-get install curl
RUN curl -u admin:nexus -o achat.jar "http://192.168.1.27:8081/repository/maven-releases/tn/esprit/rh/achat/1.2.2/achat-1.2.2.jar" -L
ENTRYPOINT ["java","-jar","/achat-1.2.2.jar"]
EXPOSE 8089

