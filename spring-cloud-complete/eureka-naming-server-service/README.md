
# Eureka Naming Server MicroService

Server Registery(Naming Server) is required for the micro-service to register and communicate among them.

Here we will see how to set-up the eureka naming server.



## Installation

We use Spring Initializer to create the springboot starter project.
The depedency used here would be

```bash
    	<dependency>
		<groupId>org.springframework.cloud</groupId>
		<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
	</dependency>
```

We use `application.yml` and it's structure would be like below

  ```bash
    spring:
      application:
        name: eureka-naming-server
    server:
      port: 8761
    eureka:
      client:
        registerWithEureka: false
        fetchRegistry: false
```

In the above `yml` file, we don't want to register eureka server as a client in itself, so we are setting `eureka.client` properties as well.

All set correctly, you can deploy on `http://localhost:8761`
