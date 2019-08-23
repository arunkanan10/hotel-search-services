package com.abc.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HotelServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServicesApplication.class, args);
	}
}
