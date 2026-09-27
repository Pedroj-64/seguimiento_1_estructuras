package com.uniquindio.edu.generics.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

// Una aplicacion necesita un contenedor reutilizable para almacenar elementos de un tipo definido.
// La interfaz generica separa el contrato de la implementacion basada en ArrayList.
/**
 * Define un contenedor genérico y una implementación basada en listas.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        ListaContenedor<String> nombres = new ListaContenedor<>();
        nombres.agregar("Ana");
        nombres.agregar("Luis");
        System.out.println(nombres.obtener(1));
    }

    /** Contrato genérico para agregar y consultar elementos por posición. */
    /** @param <T> tipo de los elementos contenidos */
    public interface Contenedor<T> {
        /** Agrega un elemento al contenedor. */
        /** @param item elemento que se agregará */
        void agregar(T item);

        /** Obtiene un elemento por su índice. */
        /** @param indice posición del elemento */
        /** @return elemento almacenado en la posición indicada */
        T obtener(int indice);
    }

    /** Implementación de {@link Contenedor} basada en una lista. */
    /** @param <T> tipo de los elementos almacenados */
    public static class ListaContenedor<T> implements Contenedor<T> {
        /** Lista interna que conserva los elementos en orden de inserción. */
        private final List<T> elementos = new ArrayList<>();

        /** {@inheritDoc} */
        @Override
        public void agregar(T item) {
            elementos.add(item);
        }

        /** {@inheritDoc} */
        @Override
        public T obtener(int indice) {
            return elementos.get(indice);
        }
    }
}