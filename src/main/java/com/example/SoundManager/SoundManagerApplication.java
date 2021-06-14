package com.example.SoundManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SoundManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoundManagerApplication.class, args);
	}

}
