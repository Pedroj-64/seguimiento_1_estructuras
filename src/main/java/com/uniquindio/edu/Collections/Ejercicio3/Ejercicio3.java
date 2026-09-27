package com.uniquindio.edu.Collections.Ejercicio3;

import java.util.Vector;

//** Un editor de texto necesita registrar 
// los cambios recientes para que el usuario pueda 
// deshacerlos cuando sea necesario. Para este caso,
//  se utilizará un Vector, ya que permite almacenar 
// los cambios de forma segura en entornos concurrentes. 
// Se deberá implementar una función de "deshacer" que elimine el último cambio realizado,
//  asegurando que se mantenga un historial de modificaciones.

/**
 * Mantiene un historial de cambios que permite deshacer la última operación.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio3 {

    /** Historial de cambios en el orden en que fueron registrados. */
    public Vector<Cambio> historial = new Vector<>();

    public static void main(String[] args) {
        Ejercicio3 ejercio = new Ejercicio3();
        ejercio.agregarCambio("Cambio 1");
        ejercio.agregarCambio("Cambio 2");
        ejercio.agregarCambio("Cambio 3");
        ejercio.deshacer();
      
        IO.println("Historial de cambios:");
        ejercio.mostrarHistorial();

        IO.println("Nuevo historial ");
        ejercio.agregarCambio("Cambio 4");
        ejercio.mostrarHistorial();

    }

    /** Añade un cambio al final del historial. */
    /** @param cambio descripción del cambio realizado */
    public void agregarCambio(String cambio) {
        historial.add(new Cambio(cambio));
    }

    /** Elimina el último cambio cuando el historial no está vacío. */
    public void deshacer() {

        if (!historial.isEmpty()) {
            historial.remove(historial.size() - 1);
        }

    }

    /** Imprime las descripciones de todos los cambios registrados. */
    public void mostrarHistorial() {
        for (Cambio cambio : historial) {
            IO.println(cambio.cambio);
        }
    }

    /** Representa un cambio realizado en el editor. */
    public class Cambio {
        /** Descripción del cambio. */
        public String cambio;

        /** Crea un cambio con su descripción. */
        /** @param cambio descripción del cambio */
        public Cambio(String cambio) {
            this.cambio = cambio;
        }
    }

}
