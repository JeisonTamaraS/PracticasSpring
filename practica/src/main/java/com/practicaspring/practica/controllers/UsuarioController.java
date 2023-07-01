package com.practicaspring.practica.controllers;

import com.practicaspring.practica.model.Ususario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value= "usuarios")//
    public List<Ususario> getUsuarios() {
        List<Ususario> usuarios = new ArrayList<>();
        Ususario usuario = new Ususario();
        usuario.setId(23);
        usuario.setNombre("jeison");
        usuario.setApellido("tamara");
        usuario.setTelefono("748399378");
        usuario.setEmail("hdhdhd@jfjfhf.com");

        Ususario usuario2 = new Ususario();
        usuario2.setId(98);
        usuario2.setNombre("andres");
        usuario2.setApellido("sangregorio");
        usuario2.setTelefono("273618273");
        usuario2.setEmail("andres@hotmail.com");

        Ususario usuario3 = new Ususario();
        usuario3.setId(198);
        usuario3.setNombre("luis");
        usuario3.setApellido("marcel");
        usuario3.setTelefono("290484720");
        usuario3.setEmail("loce@jmail.com");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }
}
