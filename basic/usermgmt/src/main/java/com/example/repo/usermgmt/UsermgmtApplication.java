package com.example.repo.usermgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class UsermgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermgmtApplication.class, args);
	}

}
