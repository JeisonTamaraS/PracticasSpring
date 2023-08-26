package com.practica.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping(value={"/index","/home","/"})
	public String index(Model modelo) {
		modelo.addAttribute("Titulo", "Hola springboot framework");
		return "index";
	}
}
