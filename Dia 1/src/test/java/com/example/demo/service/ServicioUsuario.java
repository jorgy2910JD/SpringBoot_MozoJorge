/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Jorge Mozo
 */
@Service
public class ServicioUsuario {
    private final List<Usuario> usuarios = new ArrayList<>();
    
    public ServicioUsuario () {
        // Usuario por default
        usuarios.add (new Usuario(1,"Jorge Mozo", "jorgymozo123@gmail.com")); 
    }
    public List<Usuario> find (){
        return usuarios;
    }
    public void addUsuario (Usuario usuario) {
        usuarios.add (usuario);
    }

    public Object findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
