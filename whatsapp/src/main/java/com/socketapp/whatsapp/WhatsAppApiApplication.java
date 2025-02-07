package com.socketapp.whatsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WhatsAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatsAppApiApplication.class, args);
	}

}
