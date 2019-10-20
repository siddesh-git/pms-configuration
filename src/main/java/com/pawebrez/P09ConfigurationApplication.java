package com.pawebrez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class P09ConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.pawebrez.P09ConfigurationApplication.class, args);
	}
}
