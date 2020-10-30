FROM openjdk:11
ADD target/DockerGitSprinBootService-0.0.1-SNAPSHOT.jar DockerGitSprinBootService-0.0.1-SNAPSHOT.jar
EXPOSE 8091

ENTRYPOINT ["java", "-jar", "DockerGitSprinBootService-0.0.1-SNAPSHOT.jar"]