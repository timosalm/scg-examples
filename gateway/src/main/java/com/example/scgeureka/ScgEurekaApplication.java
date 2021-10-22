package com.example.scgeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ScgEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScgEurekaApplication.class, args);
	}

}
