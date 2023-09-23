package com.practica.springboot.form.app.controllers;

/*import java.util.HashMap;
import java.util.Map;*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.practica.springboot.form.app.models.domain.Usuario;

import jakarta.validation.Valid;

@Controller
public class FormController {

	@GetMapping("/form")
	public String form(Model modelo){
		Usuario usuario= new Usuario();
		modelo.addAttribute("titulo", "Formulario Usuarios");
		modelo.addAttribute("usuario", usuario);
		return "form";
	}
	
	@PostMapping("/form")//capturamos los datos del formulario 
	public String procesar(@Valid Usuario usuario, BindingResult result, Model modelo){
		modelo.addAttribute("titulo", "Resultado formulario");
		
		if(result.hasErrors()){//validamos si el formulario tiene errores
			/*Map<String, String> errores = new HashMap<>();//guardamos los errores por cada input del formulario
			result.getFieldErrors().forEach(err ->{ 
				errores.put(err.getField(), "El campo ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
			});
			modelo.addAttribute("error", errores);*/
			return "form";
		}
		
		modelo.addAttribute("usuario", usuario);
		
		return "resultado";
	}
}
