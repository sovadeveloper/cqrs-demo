package com.sovadeveloper.cqrseventsourcingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CqrsEventSourcingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CqrsEventSourcingDemoApplication.class, args);
	}

}
