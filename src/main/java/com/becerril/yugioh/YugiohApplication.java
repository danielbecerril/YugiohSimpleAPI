package com.becerril.yugioh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class YugiohApplication {

	public static void main(String[] args) {
		SpringApplication.run(YugiohApplication.class, args);
	}

	@RestController
	@RequestMapping("/")
	public class Greetings{

		@GetMapping
		public String getGreetings(){
			return "Hello World!";
		}
	}
}
