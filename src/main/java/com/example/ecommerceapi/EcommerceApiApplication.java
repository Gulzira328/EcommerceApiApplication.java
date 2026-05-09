package com.example.ecommerceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // ← No exclude anymore
public class EcommerceApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApiApplication.class, args);
	}
}