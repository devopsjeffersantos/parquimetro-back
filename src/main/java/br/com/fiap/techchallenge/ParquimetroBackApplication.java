package br.com.fiap.techchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ParquimetroBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParquimetroBackApplication.class, args);
	
	}

}
