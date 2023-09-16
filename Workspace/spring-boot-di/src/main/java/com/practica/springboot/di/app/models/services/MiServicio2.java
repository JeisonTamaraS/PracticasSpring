package com.practica.springboot.di.app.models.services;

import org.springframework.stereotype.Component;

@Component("miServicio2")
public class MiServicio2 implements IServicio{

	@Override
	public String operacion() {
		return "Realizar otra operacion importante...";
	}
}
