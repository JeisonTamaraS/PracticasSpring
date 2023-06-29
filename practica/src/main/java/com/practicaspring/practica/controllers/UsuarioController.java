package com.practicaspring.practica.controllers;

import com.practicaspring.practica.model.Ususario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

/*Los controladores sirven para manejar las url */
public class UsuarioController {

    @RequestMapping(value= "usuario/{id}")//indicamos el requerimiento y la direccion url
    public Ususario getUsuario(@PathVariable long id){
        Ususario usuario = new Ususario();
        usuario.setId(id);
        usuario.setNombre("jeison");
        usuario.setApellido("tamara");
        usuario.setTelefono("748399378");
        usuario.setEmail("hdhdhd@jfjfhf.com");

        return usuario;
    }

}
