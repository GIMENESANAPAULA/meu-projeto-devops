FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY App.java .
RUN javac App.java
CMD ["java", "App"]
