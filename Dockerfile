FROM java:8

EXPOSE 8091

ADD /target/DockerGitSprinBootService-0.0.1-SNAPSHOT.jar DockerGitSprinBootService-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java", "-jar", "DockerGitSprinBootService-0.0.1-SNAPSHOT.jar"]