package com.feem.reiss;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReissApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReissApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
