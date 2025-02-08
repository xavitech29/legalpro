package com.proyecto.legalpro.servicio.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	 @Bean
	     SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeHttpRequests(authorizeRequests -> // Usa authorizeHttpRequests en lugar de authorizeRequests
	                authorizeRequests
	                    .requestMatchers("/public/**").permitAll() // Permite acceso público a rutas bajo /public
	                    
	                    .requestMatchers("/inicio/**").permitAll() // Permite acceso a tu plantilla
	                                        
	                    .requestMatchers("/assets/**").permitAll() // Permite acceso a archivos estáticos
	                    .anyRequest().authenticated() // Requiere autenticación para cualquier otra ruta
	            )
	            .formLogin(formLogin ->
	                formLogin
	                    .loginPage("/login") // Especifica la página de login
	                    .permitAll() // Permite acceso a la página de login sin autenticación
	            )
	            .logout(logout ->
	                logout
	                    .permitAll() // Permite acceso a la funcionalidad de logout sin autenticación
	            );
	        return http.build();
	    }

	    @Bean
	     PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder(); // Configura el codificador de contraseñas
	    }
	 
}
