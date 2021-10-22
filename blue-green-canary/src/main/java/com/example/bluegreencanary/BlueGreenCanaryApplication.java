package com.example.bluegreencanary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BlueGreenCanaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueGreenCanaryApplication.class, args);
	}

}
