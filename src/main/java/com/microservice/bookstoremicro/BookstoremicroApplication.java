package com.microservice.bookstoremicro;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//http://localhost:2222/swagger-ui/index.html#
@SpringBootApplication
@OpenAPIDefinition(
info = @Info(
		title = "Book OPEN API",
		version = "1.0.0",
description = "Book OPEN API Documentation"),
servers = @Server(
		url="http://localhost:2222",
		description ="Book OPEN API url"
))
public class BookstoremicroApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookstoremicroApplication.class, args);
	}

}
