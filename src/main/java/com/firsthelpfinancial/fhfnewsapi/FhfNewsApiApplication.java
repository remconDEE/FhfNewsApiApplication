package com.firsthelpfinancial.fhfnewsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableCaching
public class FhfNewsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FhfNewsApiApplication.class, args);
	}

}
