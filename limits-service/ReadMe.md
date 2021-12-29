## Step 1 : Spring Initializr - Setting up Limits Microservice
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

## Step 3 - Installing Git

## Step 4 - Connect Spring Cloud Config Server to Local Git Repository
- https://start.spring.io/
  - Project : Maven
  - Language : Java
  - Spring Boot : 2.6.2
  - Group : com.kaur.vandana.microservices
  - Artifacts : spring-cloud-config-server
  - Description : Centralized Configuration server
  - Dependencies : Spring Boot DevTools, Config Server SPRING CLOUD CONFIG