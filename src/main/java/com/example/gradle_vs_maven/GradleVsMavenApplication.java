package com.example.gradle_vs_maven;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Product API", description = "product microservice"))
@SpringBootApplication
public class GradleVsMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleVsMavenApplication.class, args);
	}

}
