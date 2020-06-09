package com.test.springboot2_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Springboot2TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2TestApplication.class, args);
	}

}
