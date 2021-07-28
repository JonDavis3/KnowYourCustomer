FROM openjdk:8-jdk-alpine
ADD target/technicaltest-0.0.1-SNAPSHOT.jar technicaltest-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","technicaltest-0.0.1-SNAPSHOT.jar"]