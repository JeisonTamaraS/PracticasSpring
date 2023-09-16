package com.practica.springboot.di.app.models.services;

/*import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("miServicio")*/
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		return "Ejecutando alguna operacion importante...";
	}
}
