package com.example.employeeproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeproducerApplication.class, args);
	}
}
