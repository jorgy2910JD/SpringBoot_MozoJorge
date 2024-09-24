/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.service.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Jorge Mozo
 */
@Controller
public class UsuarioController {  // Renombramos la clase a algo más específico

    @Autowired
    private ServicioUsuario servicioUsuario;

    @GetMapping("/usuarios")
    public String getAllUsers(Model model) {
        model.addAttribute("users", servicioUsuario.findAll());  // Corregimos "AddAttribute" a "addAttribute"
        return "users"; 
    }

  @PostMapping("/addUsuario")
public String addUsuario(@RequestParam String name, @RequestParam String email, Model model) {
    servicioUsuario.addUsuario(new Usuario(name, email));  // El ID se genera automáticamente
    model.addAttribute("users", servicioUsuario.findAll());
    return "redirect:/usuarios";  
}
}

