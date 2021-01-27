FROM ubuntu
RUN \
 apt-get update &&\
 apt-get install -y openjdk-11-jdk
 
VOLUME /my_volume
COPY ./target/lib ./lib/
COPY ./target/university-teacher-admin-account-1.0.0-SNAPSHOT-runner.jar .
EXPOSE 8080
CMD java -jar university-teacher-admin-account-1.0.0-SNAPSHOT-runner.jar
