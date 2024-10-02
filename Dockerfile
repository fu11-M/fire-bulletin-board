## Maven
#
#FROM openjdk:17-jdk
#
## Jar 파일의 위치
#ARG JAR_FILE=target/*.jar
#
## app.jar는 경우에 따라 이름 변경
#COPY ${JAR_FILE} fire-bulletin-board.jar
#
## 생략 가능 - 해당 컨테이너는 8080 port 를 사용한다는 의미.
#EXPOSE 8080
#
## docker run 시 실행할 필수 명령어
#ENTRYPOINT ["java", "-jar", "/fire-bulletin-board.jar"]
#
## 경우에 따라 java 옵션 사용.
## ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "/app.jar"]

## Use OpenJDK 17 base image
#FROM openjdk:17-jdk
#
## Set the path of the JAR file (use the actual path on your system)
## You can adjust the path based on where your JAR file is located in the build context.
#COPY C:/fire-bulletin-board/out/artifacts/fire_bulletin_board_jar/fire-bulletin-board.jar /fire-bulletin-board.jar
#
## Expose port 8080
#EXPOSE 8080
#
## Command to run the application
#ENTRYPOINT ["java", "-jar", "/fire-bulletin-board.jar"]
#
## Optionally, activate a Spring profile (docker)
## ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "/fire-bulletin-board.jar"]

# Use OpenJDK 17 base image
FROM openjdk:17-jdk

# Copy JAR file from the current directory (build context)
COPY fire-bulletin-board.jar /fire-bulletin-board.jar

# Expose port 8080
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/fire-bulletin-board.jar"]

