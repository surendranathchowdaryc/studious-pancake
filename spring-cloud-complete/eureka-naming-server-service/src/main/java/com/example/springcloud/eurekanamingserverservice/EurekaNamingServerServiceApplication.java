package com.example.springcloud.eurekanamingserverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * MicroService for Service Registery otherwise called a naming server.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaNamingServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingServerServiceApplication.class, args);
	}

}
