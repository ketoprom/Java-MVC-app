package com.ug.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan()
public class JavaApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaApplication.class, args);
	}
}
