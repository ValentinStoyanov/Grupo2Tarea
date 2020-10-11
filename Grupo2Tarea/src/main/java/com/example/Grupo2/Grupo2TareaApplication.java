package com.example.Grupo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.controller")
@EnableMongoRepositories("com.persistence")
public class Grupo2TareaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Grupo2TareaApplication.class, args);
	}

}
