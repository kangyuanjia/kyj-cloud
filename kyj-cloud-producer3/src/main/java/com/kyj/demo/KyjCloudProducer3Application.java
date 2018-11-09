package com.kyj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KyjCloudProducer3Application {

	public static void main(String[] args) {
		SpringApplication.run(KyjCloudProducer3Application.class, args);
	}
}
