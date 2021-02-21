package com.ionut.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //Habilitamos el cliente
public class Ejercicio7Rest2PspApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio7Rest2PspApplication.class, args);
	}

}
