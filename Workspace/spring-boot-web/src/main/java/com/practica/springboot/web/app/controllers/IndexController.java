package com.practica.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practica.springboot.web.app.models.Usuarios;

@Controller
@RequestMapping("/app")//creamos una ruta de primer nivel para diferenciar los metodos de la paginas principales
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;
	
	@GetMapping({"/index","/home","/"})//
	public String index(Model modelo) {//declaramos la interface model para usar sus metodos 
		modelo.addAttribute("titulo", textoIndex);//con el metodo addAtribute agregamos valores al modelo  
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model modelo){
		//creamos el modelo 
		Usuarios usuario = new Usuarios();
		usuario.setNombre("jeison");
		usuario.setApellido("tamara");
		usuario.setEmail("jeison.andres@email.com");
		
		modelo.addAttribute("usuario", usuario);//pasamos el modelo a la vista
		modelo.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model modelo){
		List<Usuarios> usuarios = new ArrayList<>();
		usuarios.add(new Usuarios("jeison","tamara","jeison.andres@email.com"));
		usuarios.add(new Usuarios("andres","sangregorio","andres2@email.com"));
		usuarios.add(new Usuarios("luis","gregorio","luis@email.com"));
		
		modelo.addAttribute("titulo", textoListar);
		modelo.addAttribute("usuarios", usuarios);
		
		return "listar";
	}
}
