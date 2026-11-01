package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class IaService {

    @Value("${cotiza.ia.llave}")
    String llave;

    public String generarBorrador(String mensajeCliente) {
        // aca va lo de gemini, ya funciona en mi pc
        System.out.println("usando llave " + llave);
        return "Borrador para: " + mensajeCliente;
    }
}
