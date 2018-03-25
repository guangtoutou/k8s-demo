FROM openjdk:8-alpine
VOLUME /tmp
ADD ./target/k8sdemo-0.0.1-SNAPSHOT.jar /userservice.jar
RUN sh -c 'touch /userservice.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/userservice.jar"]