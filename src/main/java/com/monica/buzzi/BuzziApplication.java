package com.monica.buzzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@RestController
public class BuzziApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BuzziApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BuzziApplication.class);
	}
	
	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World!";
	}

	@RequestMapping(value = "/products")
	public ResponseEntity<Object> getProducts() {
		return null;
	}
	
	public ResponseEntity<Object> createProduct(@RequestBody Product product) {
		return null;
	}
	
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String id) {
		return null;
	}
	
	public ResponseEntity<Object> getProduct(
			@RequestParam(value = "name", required = false, defaultValue = "honey") String name) {
		return null;
	}
	
}
