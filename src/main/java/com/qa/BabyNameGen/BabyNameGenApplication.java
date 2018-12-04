package com.qa.BabyNameGen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BabyNameGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabyNameGenApplication.class, args);
	}

	@Bean
	public StringBuilder stringBuilder(){
		return new StringBuilder();
	}

}
