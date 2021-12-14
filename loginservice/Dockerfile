FROM adoptopenjdk:8-jre-hotspot-bionic
ADD target/loginservice-0.0.1-SNAPSHOT.jar loginservice.jar
EXPOSE 9001
ENTRYPOINT [ "java", "-jar" , "loginservice.jar"]
