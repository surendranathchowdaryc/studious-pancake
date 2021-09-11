
# SpringBoot App With Actuator and Swagger

Simple springboot app that covers the basics required to understand actuautor and swagger-ui.


## Installation

From Spring Initialiser project add 
+ spring-boot-starter-actuator(https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
+ spring-boot-starter-web
+ spring-boot-devtools
Then add `springdoc-openapi-ui` pesent at https://springdoc.org/ so we would get swagger rest documentation capabilities in `pom.xml`

```bash
    <dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-ui</artifactId>
      <version>1.5.10</version>
   </dependency>
```
    
## Deployment

Launch the app and if running on local host you can use
+ http://localhost:8080/swagger-ui.html
+ http://localhost:8080/actuator/
In `application.properties` add the following property to include all metrics(it should only be used in dev setup)

```bash
management.endpoints.web.exposure.include=*
```


  
