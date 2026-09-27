package com.uniquindio.edu.Collections.Ejercicio4;

import java.util.Stack;

//**En la navegación web, los usuarios necesitan poder retroceder a páginas anteriores.
//  Para este propósito, se usará un Stack, que funciona como una pila LIFO (Last In, First Out).
//  Cada vez que el usuario visite una nueva página, esta se añadirá a la pila,
// y cuando decida volver atrás, se eliminará la última página visitada para regresar a la anterior.
//  */

/**
 * Simula el historial de navegación web mediante una pila.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio4 {

    /** Pila con las páginas visitadas, desde la más antigua a la más reciente. */
    Stack<String> historialPaginas = new Stack<>();

    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.añadirPagina("yahoo.com");
        ejercicio4.añadirPagina("Youtube.com");
        ejercicio4.añadirPagina("mileroticos.com");

        IO.println("El historial actual es: ");
        ejercicio4.mostrarHistorial();
        ejercicio4.volverAnterior();
        IO.println("Historial nuevo: ");
        ejercicio4.mostrarHistorial();
        
    }

    /** Muestra el contenido actual del historial de navegación. */
    public void mostrarHistorial(){
        IO.println(historialPaginas.toString());
    }

    /** Añade una página nueva al tope de la pila. */
    /** @param pagina dirección de la página visitada */
    public void añadirPagina(String pagina){
        historialPaginas.push(pagina);
    }

    /** Elimina la página actual e informa cuál queda como anterior. */
    public void volverAnterior(){
        IO.println("Se elimino la pagina :"+historialPaginas.pop());
        IO.println("Esta volviendo a la pagina:" + historialPaginas.peek());
    }
}
