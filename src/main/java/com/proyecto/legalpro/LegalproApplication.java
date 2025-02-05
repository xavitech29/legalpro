package com.proyecto.legalpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LegalproApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegalproApplication.class, args);
	}

}
