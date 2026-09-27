package com.uniquindio.edu.generics.Ejercicio2;

// Un sistema de pruebas necesita mostrar datos de distintos tipos sin duplicar metodos.
// Un metodo estatico generico permite recibir e imprimir cualquier valor de forma segura.
/**
 * Muestra cómo declarar y usar un método estático genérico.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        mostrarElemento("Hola generics");
        mostrarElemento(2026);
        mostrarElemento(3.14);
    }

    /** Imprime un elemento de cualquier tipo manteniendo seguridad genérica. */
    /** @param <T> tipo del elemento */
    /** @param elemento valor que se imprimirá */
    public static <T> void mostrarElemento(T elemento) {
        System.out.println(elemento);
    }
}