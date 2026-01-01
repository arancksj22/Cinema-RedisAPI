package com.example.CinemaRedisAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CinemaRedisApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaRedisApiApplication.class, args);
	}

}
