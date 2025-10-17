package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

public class FiguraTest {

    //(1.2ptos) usar en el test assertEquals    
    //public double calcularArea(double base, double altura)
   @Test
   @DisplayName("Concatenar dos cadenas devuelve su combinación")
   void testCalcularArea() {
        Figura figura = new Figura("Triángulo");
        double area = figura.calcularArea(4, 5);
        assertEquals(10, area,"El resultado del área debe ser 10");
   }


    //(1.2ptos) usar en el test assertNull
    //public String cambiarNombre(String nuevoNombre) {
    @Test
    @DisplayName("Cambiar nombre a nulo devuelve null")
    void testCambiarNombre() {
        Figura figura = new Figura("Heptágono");
        String nombre = figura.cambiarNombre(null);
        assertNull(nombre, "El nombre es nulo");

        //String nombre2 = figura.cambiarNombre("Martín");
        //assertNull(nombre2, "El nombre NO es nulo");        
    }

    //(1.2ptos) usar en el test assertTrue
    //public boolean esCuadrado(double lado1, double lado2) {
    @Test
    @DisplayName("Comprobar que la figura es un cuadrado")
    void testEsCuadrado(){
        Figura figura = new Figura("Heptágono");
        boolean esCuadrado = figura.esCuadrado(3.5, 3.5);
        assertTrue(esCuadrado, "La figura es un cuadrado");

        //boolean esCuadrado2 = figura.esCuadrado(5, 3.5);
        //assertTrue(esCuadrado2, "La figura No es un cuadrado");
    }
    
}
