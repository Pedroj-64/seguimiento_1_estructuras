package com.uniquindio.edu.generics.Ejercicio9;

import java.util.ArrayList;
import java.util.List;

// Un servicio numerico debe encontrar extremos de listas cuyo tipo sea numerico y comparable.
// Esta interfaz combina las restricciones Number y Comparable<T> en el mismo tipo generico.
/**
 * Busca valores extremos en listas de números comparables.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        ServicioNumerico<Integer> servicio = new ServicioNumerico<>();
        List<Integer> valores = new ArrayList<>(List.of(7, 2, 10, 4));
        System.out.println("Minimo: " + servicio.minimo(valores));
        System.out.println("Maximo: " + servicio.maximo(valores));
    }

    /** Contrato para hallar extremos de listas numéricas ordenables. */
    /** @param <T> tipo numérico comparable */
    public interface Servicio<T extends Number & Comparable<T>> {
        /** Obtiene el menor elemento de una lista. */
        /** @param lista valores que se analizarán */
        /** @return menor valor de la lista */
        T minimo(List<T> lista);

        /** Obtiene el mayor elemento de una lista. */
        /** @param lista valores que se analizarán */
        /** @return mayor valor de la lista */
        T maximo(List<T> lista);
    }

    /** Implementa búsquedas de mínimo y máximo para tipos numéricos comparables. */
    /** @param <T> tipo numérico comparable */
    public static class ServicioNumerico<T extends Number & Comparable<T>> implements Servicio<T> {
        /** {@inheritDoc} */
        @Override
        public T minimo(List<T> lista) {
            validarLista(lista);
            T minimo = lista.get(0);
            for (T elemento : lista) {
                if (elemento.compareTo(minimo) < 0) {
                    minimo = elemento;
                }
            }
            return minimo;
        }

        /** {@inheritDoc} */
        @Override
        public T maximo(List<T> lista) {
            validarLista(lista);
            T maximo = lista.get(0);
            for (T elemento : lista) {
                if (elemento.compareTo(maximo) > 0) {
                    maximo = elemento;
                }
            }
            return maximo;
        }

        /** Valida que la lista exista y tenga al menos un elemento. */
        /** @param lista lista que se validará */
        /** @throws IllegalArgumentException si la lista es nula o está vacía */
        private void validarLista(List<T> lista) {
            if (lista == null || lista.isEmpty()) {
                throw new IllegalArgumentException("La lista no puede estar vacia");
            }
        }
    }
}