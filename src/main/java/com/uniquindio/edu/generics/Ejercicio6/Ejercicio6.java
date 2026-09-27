package com.uniquindio.edu.generics.Ejercicio6;

// Una calculadora necesita duplicar valores numericos sin aceptar objetos que no sean Number.
// La restriccion T extends Number permite usar cualquier tipo numerico compatible.
/**
 * Trabaja con tipos genéricos restringidos a valores numéricos.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        CajaNumerica<Integer> caja = new CajaNumerica<>(15);
        System.out.println("Doble: " + caja.doble());
        System.out.println("Suma: " + sumar(4.5, 2.5));
    }

    /** Suma dos valores pertenecientes a tipos numéricos compatibles. */
    /** @param <T> tipo numérico de los operandos */
    /** @param primerNumero primer sumando */
    /** @param segundoNumero segundo sumando */
    /** @return suma convertida a {@code double} */
    public static <T extends Number> double sumar(T primerNumero, T segundoNumero) {
        return primerNumero.doubleValue() + segundoNumero.doubleValue();
    }

    /** Caja especializada para valores numéricos. */
    /** @param <T> tipo numérico almacenado */
    public static class CajaNumerica<T extends Number> {
        /** Número almacenado. */
        private final T numero;

        /** Crea una caja numérica. */
        /** @param numero valor que se almacenará */
        public CajaNumerica(T numero) {
            this.numero = numero;
        }

        /** @return el doble del número almacenado */
        public double doble() {
            return numero.doubleValue() * 2;
        }
    }
}