package com.practicaspring.practica.dao;

import com.practicaspring.practica.model.Ususario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class UsuarioDaoImp implements UsuarioDao{
    @Override
    public List<Ususario> getUsuarios() {
        return null;
    }
}
