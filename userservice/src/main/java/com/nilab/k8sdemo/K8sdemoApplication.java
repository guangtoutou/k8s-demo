package com.nilab.k8sdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class K8sdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sdemoApplication.class, args);
	}

	@RestController
	class HelloController{
		@GetMapping("/hello")
		String hello() throws UnknownHostException {
			return "Hello Kubernauts!" + InetAddress.getLocalHost().getHostName().toString();
		}
	}
}
