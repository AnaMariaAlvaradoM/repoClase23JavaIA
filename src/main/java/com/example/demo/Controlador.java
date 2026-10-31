package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controlador {

    @Autowired
    ClienteRepository repo;

    @GetMapping("/clientes")
    public List<Cliente> todos() {
        System.out.println("entro aca!!!!");
        return repo.findAll();
    }

    @PostMapping("/clientes")
    public Cliente guardar(@RequestBody Cliente c) {
        // if (c.nombre == null) {
        //     return null;
        // }
        System.out.println(c.nombre + " " + c.correo);
        return repo.save(c);
    }

    @GetMapping("/clientes/{id}")
    public Cliente uno(@PathVariable Long id) {
        return repo.findById(id).get();
    }

    // TODO arreglar esto despues
    @DeleteMapping("/borrar/{id}")
    public String borrar(@PathVariable Long id) {
        repo.deleteById(id);
        return "borrado ok";
    }
}
