package com.reto2.businessimprovementv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BusinessImprovementV1Application {

	public static void main(String[] args) {
		SpringApplication.run(BusinessImprovementV1Application.class, args);
	}

}
