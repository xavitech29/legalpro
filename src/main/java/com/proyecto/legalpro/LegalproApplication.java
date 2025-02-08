package com.proyecto.legalpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) - esto es para usar sin base de datos
@SpringBootApplication
public class LegalproApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegalproApplication.class, args);
	}

}
