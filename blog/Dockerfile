FROM java:8
EXPOSE 8080
ARG JAR_FILE
ADD target/${JAR_FILE} /blog.jar
ENTRYPOINT ["java", "-jar","/blog.jar"]