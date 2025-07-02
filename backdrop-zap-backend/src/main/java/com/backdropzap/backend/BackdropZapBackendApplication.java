package com.backdropzap.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BackdropZapBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackdropZapBackendApplication.class, args);
	}

}
