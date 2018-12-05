package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching //¿ªÆô×¢½â
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
