package com.uniquindio.edu.generics.Ejercicio4;

// Una utilidad de arreglos debe intercambiar elementos sin conocer de antemano su tipo.
// El metodo generico recibe dos posiciones y conserva la seguridad de tipos del arreglo.
/**
 * Intercambia posiciones de arreglos mediante un método genérico.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Carlos"};
        intercambiar(nombres, 0, 2);
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    /** Intercambia dos posiciones de un arreglo de cualquier tipo. */
    /** @param <T> tipo de los elementos del arreglo */
    /** @param arreglo arreglo cuyos elementos se intercambiarán */
    /** @param primeraPosicion primera posición del intercambio */
    /** @param segundaPosicion segunda posición del intercambio */
    public static <T> void intercambiar(T[] arreglo, int primeraPosicion, int segundaPosicion) {
        T temporal = arreglo[primeraPosicion];
        arreglo[primeraPosicion] = arreglo[segundaPosicion];
        arreglo[segundaPosicion] = temporal;
    }
}