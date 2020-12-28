package com.agh.Eventarz2Eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eventarz2EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eventarz2EurekaApplication.class, args);
	}

}
