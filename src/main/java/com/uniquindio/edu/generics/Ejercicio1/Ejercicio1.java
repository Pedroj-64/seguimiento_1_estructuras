package com.uniquindio.edu.generics.Ejercicio1;

// Una caja de almacenamiento debe poder guardar y entregar valores de cualquier tipo.
// Para evitar conversiones innecesarias, se implementa usando la clase generica Caja<T>.
/**
 * Demuestra el uso de una caja genérica para distintos tipos.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Estructuras de datos");
        System.out.println(cajaTexto.obtener());

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(25);
        System.out.println(cajaNumero.obtener());
    }

    /** Caja tipada que almacena un único valor. */
    public static class Caja<T> {
        /** Valor almacenado actualmente. */
        private T contenido;

        /** Guarda o reemplaza el valor de la caja. */
        /** @param valor valor que se almacenará */
        public void guardar(T valor) {
            contenido = valor;
        }

        /** @return valor almacenado, o {@code null} si aún no se ha guardado uno */
        public T obtener() {
            return contenido;
        }
    }
}