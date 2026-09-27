package com.uniquindio.edu.generics.Ejercicio7;

// Un comparador reutilizable debe trabajar con cualquier tipo que tenga orden natural.
// La restriccion Comparable<T> permite comparar los valores mediante compareTo.
/**
 * Compara elementos genéricos mediante su orden natural.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Comparador<String> comparador = new Comparador<>();
        System.out.println(comparador.mayor("Ana", "Luis"));
    }

    /** Comparador de valores con orden natural. */
    /** @param <T> tipo comparable que se comparará */
    public static class Comparador<T extends Comparable<T>> {
        /** Devuelve el mayor de dos valores según su orden natural. */
        /** @param primerElemento primer valor */
        /** @param segundoElemento segundo valor */
        /** @return el mayor valor; en caso de empate, el primero */
        public T mayor(T primerElemento, T segundoElemento) {
            return primerElemento.compareTo(segundoElemento) >= 0
                    ? primerElemento
                    : segundoElemento;
        }
    }
}