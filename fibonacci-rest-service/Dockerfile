FROM openjdk:8-jdk-alpine
ADD target/fibonacci-rest-service-0.0.1-SNAPSHOT.jar fibonacci-rest-service-0.0.1-SNAPSHOT.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","fibonacci-rest-service-0.0.1-SNAPSHOT.jar"]