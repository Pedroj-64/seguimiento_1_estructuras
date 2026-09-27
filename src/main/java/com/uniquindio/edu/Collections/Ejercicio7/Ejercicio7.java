package com.uniquindio.edu.Collections.Ejercicio7;

import java.util.LinkedHashSet;

// En una aplicación de música, los usuarios pueden marcar canciones como favoritas.
//  Para garantizar que las canciones favoritas se mantengan en el orden en que fueron añadidas 
// sin permitir duplicados, se empleará un LinkedHashSet, el cual conservará la secuencia de inserción
//  y asegurará que no haya repeticiones.

/**
 * Administra canciones favoritas sin duplicados y conservando su orden.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio7 {

    /** Canciones favoritas conservando el orden de inserción. */
    private final LinkedHashSet<String> cancionesFavoritas = new LinkedHashSet<>();

    public static void main(String[] args) {
        Ejercicio7 ejercicio7 = new Ejercicio7();
        ejercicio7.agregarFavorita("Imagine");
        ejercicio7.agregarFavorita("Bohemian Rhapsody");
        ejercicio7.agregarFavorita("Imagine");
        ejercicio7.mostrarFavoritas();
    }

    /** Añade una canción y evita duplicados. */
    /** @param cancion título de la canción */
    /** @return {@code true} si la canción fue añadida */
    public boolean agregarFavorita(String cancion) {
        return cancionesFavoritas.add(cancion);
    }

    /** Imprime las canciones favoritas en orden de inserción. */
    public void mostrarFavoritas() {
        for (String cancion : cancionesFavoritas) {
            System.out.println(cancion);
        }
    }

    /** @return copia independiente del conjunto de canciones favoritas */
    public LinkedHashSet<String> getCancionesFavoritas() {
        return new LinkedHashSet<>(cancionesFavoritas);
    }
}