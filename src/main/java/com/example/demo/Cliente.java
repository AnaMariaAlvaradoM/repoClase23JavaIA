package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nombre;
    public String correo;
    public String telefono;
    public String notasInternas;

    // public String direccion;
    // public String ciudad;
    // public int edad;
}
