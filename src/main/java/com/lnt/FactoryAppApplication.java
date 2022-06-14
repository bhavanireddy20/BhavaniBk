package com.lnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // @Configuration, @ComponentScan, @EnableAutoConfiguration ==>@SpringBootApplication
public class FactoryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryAppApplication.class, args);
	}

}
