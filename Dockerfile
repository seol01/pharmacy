FROM openjdk:17
ARG JAR_FILE=build/libs/pharmacy.jar
COPY ${JAR_FILE} ./pharmacy.jar
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-jar", "./pharmacy.jar"]