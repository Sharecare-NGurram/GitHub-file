FROM openjdk:8
EXPOSE 8080
ADD target/androidci.jar androidci.jar
ENTRYPOINT ["java","-jar","/androidci.jar"]
