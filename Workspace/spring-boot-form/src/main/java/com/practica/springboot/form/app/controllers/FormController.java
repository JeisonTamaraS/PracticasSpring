package com.practica.springboot.form.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;

/*import java.util.HashMap;
import java.util.Map;*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.practica.springboot.form.app.models.domain.Usuario;
import com.practica.springboot.form.app.validation.UsuarioValidador;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("usuario")
public class FormController {
	
	@Autowired
	private UsuarioValidador validador;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(validador);
	}
	
	@GetMapping("/form")
	public String form(Model modelo){
		Usuario usuario= new Usuario();
		usuario.setNombre("jeison");
		usuario.setApellido("tamara");
		usuario.setIdentificador("123.456.789-K");
		modelo.addAttribute("titulo", "Formulario Usuarios");
		modelo.addAttribute("usuario", usuario);
		return "form";
	}
	
	@PostMapping("/form")//capturamos los datos del formulario 
	public String procesar(@Valid Usuario usuario, BindingResult result, Model modelo, SessionStatus status){
		//validador.validate(usuario, result);
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
		status.setComplete();
		return "resultado";
	}
}
