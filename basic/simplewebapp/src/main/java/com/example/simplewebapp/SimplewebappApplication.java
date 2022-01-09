package com.example.simplewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableWebMvc
@ComponentScan
@EnableConfigurationProperties
@PropertySource("classpath:application.yml")
public class SimplewebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplewebappApplication.class, args);
	}

}
