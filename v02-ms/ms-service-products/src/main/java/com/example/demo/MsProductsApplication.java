package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"ms.pe.common.models.entity"})
public class MsProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProductsApplication.class, args);
	}

}
