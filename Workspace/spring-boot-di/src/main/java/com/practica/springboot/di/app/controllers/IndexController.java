package com.practica.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.practica.springboot.di.app.models.services.IServicio;


@Controller
public class IndexController {
	
	@Autowired
	private IServicio servicio;
	
	@GetMapping({"/","","/index"})
	public String index(Model modelo){
		modelo.addAttribute("objeto", servicio.operacion());
		return "index";
	}
	
}
