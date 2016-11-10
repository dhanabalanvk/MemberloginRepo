FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD login-1.0.0-SNAPSHOT.jar springboot-login.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springboot-login.jar"]
