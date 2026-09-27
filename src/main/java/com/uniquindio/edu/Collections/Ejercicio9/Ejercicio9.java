package com.uniquindio.edu.Collections.Ejercicio9;

import java.util.HashMap;
import java.util.Map;

// Un directorio telefónico necesita almacenar nombres junto con sus respectivos números de teléfono
//  y permitir búsquedas eficientes. Para este caso, se usará un HashMap, el cual asociará cada nombre
//  con su número telefónico, posibilitando consultas rápidas y evitando duplicados.

/**
 * Implementa un directorio telefónico con búsquedas por nombre.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio9 {
    /** Relación entre nombres de contactos y números telefónicos. */
    private final Map<String, String> directorio = new HashMap<>();

    public static void main(String[] args) {
        Ejercicio9 ejercicio9 = new Ejercicio9();
        ejercicio9.agregarContacto("Laura", "3001234567");
        ejercicio9.agregarContacto("Carlos", "3107654321");
        System.out.println("Telefono de Laura: " + ejercicio9.buscarTelefono("Laura"));
    }

    /** Registra o actualiza el teléfono asociado a un nombre. */
    /** @param nombre nombre del contacto */
    /** @param telefono número telefónico del contacto */
    public void agregarContacto(String nombre, String telefono) {
        directorio.put(nombre, telefono);
    }

    /** Busca el teléfono asociado a un contacto. */
    /** @param nombre nombre del contacto */
    /** @return teléfono registrado o {@code null} si no existe */
    public String buscarTelefono(String nombre) {
        return directorio.get(nombre);
    }

    /** @return copia independiente del directorio telefónico */
    public Map<String, String> getDirectorio() {
        return new HashMap<>(directorio);
    }
}