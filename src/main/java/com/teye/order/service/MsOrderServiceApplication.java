package com.teye.order.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MsOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsOrderServiceApplication.class, args);
	}
	@GetMapping("/orderService")
	public String order() {
		return "Order-Service";
	}
}
