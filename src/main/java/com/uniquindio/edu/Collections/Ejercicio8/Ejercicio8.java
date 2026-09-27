package com.uniquindio.edu.Collections.Ejercicio8;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// En una aplicación de mensajería, se requiere un historial de los últimos mensajes enviados.
//  Para lograrlo, se utilizará un ArrayDeque, que permitirá agregar nuevos mensajes al final 
// de la estructura y recuperar los últimos diez mensajes enviados de manera rápida y eficiente.
/**
 * Conserva los diez mensajes más recientes de una aplicación.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio8 {
    /** Cantidad máxima de mensajes conservados. */
    private static final int MAXIMO_MENSAJES = 10;
    /** Historial de mensajes desde el más antiguo al más reciente. */
    private final Deque<String> mensajes = new ArrayDeque<>();

    public static void main(String[] args) {
        Ejercicio8 ejercicio8 = new Ejercicio8();
        for (int numero = 1; numero <= 12; numero++) {
            ejercicio8.enviarMensaje("Mensaje " + numero);
        }
        System.out.println(ejercicio8.obtenerUltimosMensajes());
    }

    /** Guarda un mensaje y descarta el más antiguo si se alcanzó el límite. */
    /** @param mensaje contenido del mensaje enviado */
    public void enviarMensaje(String mensaje) {
        if (mensajes.size() == MAXIMO_MENSAJES) {
            mensajes.removeFirst();
        }
        mensajes.addLast(mensaje);
    }

    /** @return lista con los mensajes conservados, del más antiguo al más reciente */
    public List<String> obtenerUltimosMensajes() {
        return new ArrayList<>(mensajes);
    }
}