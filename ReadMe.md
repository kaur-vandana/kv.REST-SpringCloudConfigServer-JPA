## Step 1 : Spring Initializr - Setting up limits-service
- https://start.spring.io/
    - Project : Maven
    - Language : Java
    - Spring Boot : 2.6.2
    - Group : com.kaur.vandana.microservices
    - Artifacts : limits-service
    - Dependencies : Spring Web, Spring Boot DevTools, Spring Boot Actuator, Config Client

## Step 2
- Creating a hard coded limits service
- Enhance limits service to pick up configuration from application properties
- Setting up Spring Cloud Config Server
- <artifactId>spring-cloud-starter-config</artifactId>
- application.properties
    - spring.config.import=configserver:http://localhost:8888

## Step 3 -

## Step 4 - Installing Git and Connect Spring Cloud Config Server to Local Git Repository
- Spring Initializr - Setting up spring-cloud-config-server
- https://start.spring.io/
    - Project : Maven
    - Language : Java
    - Spring Boot : 2.6.2
    - Group : com.kaur.vandana.microservices
    - Artifacts : spring-cloud-config-server
    - Description : Centralized Configuration server
    - Dependencies : Spring Boot DevTools, Config Server SPRING CLOUD CONFIG

- Create Local Git Repository - git-localconfig-repo
- add limits-service.properties to it

------------------------------------------------------------------------------------------------------------------------

http://localhost:8888/limits-service/default

Located environment
name : limits-service
server Port : http://localhost:8888
Profile : default

------------------------------------------------------------------------------------------------------------------------

# More Reading about Microservices
- Design and Governance of Microservices
    - https://martinfowler.com/microservices/

- 12 Factor App
    - https://12factor.net/
    - https://dzone.com/articles/the-12-factor-app-a-java-developers-perspective

- Spring Cloud
    - http://projects.spring.io/spring-cloud/

------------------------------------------------------------------------------------------------------------------------