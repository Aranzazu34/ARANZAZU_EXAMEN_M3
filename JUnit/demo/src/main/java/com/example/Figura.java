package com.example;

public class Figura { 
    private String nombre; 

    // constructor. No hacer test aquí
    public Figura(String nombre) {
    this.nombre = nombre;
    }

    // (1.2ptos) usar en el test assertEquals    
    public double calcularArea(double base, double altura) { 
    return (base * altura) / 2;
    } 

    // (1.2ptos) usar en el test assertNull
    public String cambiarNombre(String nuevoNombre) {
        if (nuevoNombre == null || nuevoNombre.isEmpty()) {
            return null;  // devuelve null si el nombre es inválido
        }
        this.nombre = nuevoNombre;
        return this.nombre;
    }

    // (1.2ptos) usar en el test assertTrue
    public boolean esCuadrado(double lado1, double lado2) {
        return lado1 == lado2;
    }
}