package com.pawebrez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class P09ConfigurationApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(com.pawebrez.P09ConfigurationApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(P09ConfigurationApplication.class);
	}
}
