FROM openjdk:17
EXPOSE 8080
ADD target/boot-jenkins-pipeline.jar boot-jenkins-pipeline.jar
ENTRYPOINT ["java", "-jar","/boot-jenkins-pipeline.jar"]