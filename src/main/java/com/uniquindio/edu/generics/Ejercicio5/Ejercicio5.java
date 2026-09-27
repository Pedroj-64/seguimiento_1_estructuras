package com.uniquindio.edu.generics.Ejercicio5;

import java.util.Objects;

// Un registro puede relacionar dos valores del mismo tipo y comprobar si son iguales.
// La clase Par<T> evita que se mezclen tipos incompatibles en una misma pareja.
/**
 * Compara dos valores contenidos en un par genérico.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Par<Integer> par = new Par<>(10, 10);
        System.out.println("Los valores son iguales: " + par.sonIguales());
    }

    /** Par de valores que deben pertenecer al mismo tipo genérico. */
    /** @param <T> tipo de ambos valores */
    public static class Par<T> {
        /** Primer valor del par. */
        private final T primerValor;
        /** Segundo valor del par. */
        private final T segundoValor;

        /** Crea un par de valores. */
        /** @param primerValor primer valor */
        /** @param segundoValor segundo valor */
        public Par(T primerValor, T segundoValor) {
            this.primerValor = primerValor;
            this.segundoValor = segundoValor;
        }

        /** @return {@code true} si ambos valores son iguales */
        public boolean sonIguales() {
            return Objects.equals(primerValor, segundoValor);
        }
    }
}