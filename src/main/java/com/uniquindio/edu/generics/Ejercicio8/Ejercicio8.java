package com.uniquindio.edu.generics.Ejercicio8;

import java.util.ArrayList;
import java.util.List;

// Un almacen debe guardar elementos ordenables y consultar el mayor de los registrados.
// La interfaz impone el orden natural y la implementacion conserva los elementos en una lista.
/**
 * Implementa un almacén genérico que consulta su elemento máximo.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        AlmacenNumerico<Integer> almacen = new AlmacenNumerico<>();
        almacen.guardar(8);
        almacen.guardar(15);
        almacen.guardar(4);
        System.out.println("Maximo: " + almacen.maximo());
    }

    /** Contrato para almacenar valores y consultar el máximo. */
    /** @param <T> tipo comparable de los elementos */
    public interface Almacenable<T extends Comparable<T>> {
        /** Guarda un elemento en el almacén. */
        /** @param item elemento que se guardará */
        void guardar(T item);

        /** @return elemento máximo o {@code null} si el almacén está vacío */
        T maximo();
    }

    /** Almacén basado en una lista que utiliza el orden natural. */
    /** @param <T> tipo comparable de los elementos */
    public static class AlmacenNumerico<T extends Comparable<T>> implements Almacenable<T> {
        /** Elementos guardados en el almacén. */
        private final List<T> elementos = new ArrayList<>();

        /** {@inheritDoc} */
        @Override
        public void guardar(T item) {
            elementos.add(item);
        }

        /** {@inheritDoc} */
        @Override
        public T maximo() {
            if (elementos.isEmpty()) {
                return null;
            }

            T mayor = elementos.get(0);
            for (int indice = 1; indice < elementos.size(); indice++) {
                if (elementos.get(indice).compareTo(mayor) > 0) {
                    mayor = elementos.get(indice);
                }
            }
            return mayor;
        }
    }
}