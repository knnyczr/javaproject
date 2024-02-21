package com.doggos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.doggos")
public class DoggoApp {
	public static void main(String[] args) {
		SpringApplication.run(DoggoApp.class, args);
	}

}
