package com.practica.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.practica.springboot.di.app.models.services.IServicio;
import com.practica.springboot.di.app.models.services.MiServicio;

@Configuration
public class AppConfig {
	
	@Bean("miServicio")
	public IServicio registrarMyServicio(){
		
		return new MiServicio();
	}
	@Primary
	@Bean("miServicio2")
	public IServicio registrarMyServicio2(){
		
		return new MiServicio();
	}
}
