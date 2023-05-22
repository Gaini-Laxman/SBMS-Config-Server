package com.klinnovations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SbmsConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsConfigServerAppApplication.class, args);
	}

}
