package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // Levantar el servicio de Eureka
public class TareaEurekaServerCochesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaEurekaServerCochesApplication.class, args);
	}

}
