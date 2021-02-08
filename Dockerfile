FROM openjdk:11-jre
COPY ./target/business-improvement-v1-0.0.1-SNAPSHOT.jar /opt/business-improvement-v1.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8", "-jar", "/opt/business-improvement-v1.jar"]