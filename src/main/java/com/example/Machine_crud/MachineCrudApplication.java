package com.example.Machine_crud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.Machine_crud.dao")
public class MachineCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MachineCrudApplication.class, args);
	}

}
