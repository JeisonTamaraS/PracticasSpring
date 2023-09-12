package com.practica.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	@GetMapping("/")
	public String index(){
		return "params/index";
	}
	
	@GetMapping("/string")
	public String param(@RequestParam(name="texto",required = false,defaultValue = "Valor por defecto.") String texto, Model modelo) {//enviamos parametros mediante la url con la anotacion @requestpram
		modelo.addAttribute("resultado", "El texto enviado es: "+ texto);
		
		return "params/ver";
	}
	
	@GetMapping("/mixparam")
	public String param(@RequestParam String saludo, @RequestParam String numero , Model modelo) {//enviamos mas de un parametro mediante la url con la anotacion @requestpram
		modelo.addAttribute("resultado", "El saludo enviado es: '"+saludo+"' y el numero es '"+numero+"'.");
		
		return "params/ver";
	}
	
	@GetMapping("/mixparam-request")
	public String param(HttpServletRequest request, Model modelo) {//tenemos otra manera de enviar datos por la url utilizando HttpServletRequest 
		String saludo= request.getParameter("saludo");
		Integer numero=null;
				
		try {
			numero= Integer.parseInt(request.getParameter("numero"));
		}catch(NumberFormatException e) {
			numero=0;
		}
		modelo.addAttribute("resultado", "El saludo enviado es: '"+saludo+"' y el numero es '"+numero+"'.");
		
		return "params/ver";
	}
}
