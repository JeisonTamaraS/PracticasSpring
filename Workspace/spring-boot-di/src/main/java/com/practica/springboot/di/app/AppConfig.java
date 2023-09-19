package com.practica.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.practica.springboot.di.app.models.domain.ItemFactura;
import com.practica.springboot.di.app.models.domain.Producto;
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
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1= new Producto("Camara Sony", 100); 
		Producto producto2= new Producto("Bicicleta saft aro 27", 200); 
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1= new Producto("Monitor LG 24", 250); 
		Producto producto2= new Producto("Laptop Lenovo", 500); 
		Producto producto3= new Producto("Impresora Multifuncional", 80); 
		Producto producto4= new Producto("Escritorio Oficina", 300); 
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
}
