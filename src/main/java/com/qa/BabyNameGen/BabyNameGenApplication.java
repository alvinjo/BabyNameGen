package com.qa.BabyNameGen;

import com.qa.BabyNameGen.util.NameGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BabyNameGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabyNameGenApplication.class, args);
	}


	@Bean
	public NameGenerator nameGenerator(){
		return new NameGenerator();
	}

	@Bean
	public StringBuilder stringBuilder(){
		return new StringBuilder();
	}

}
