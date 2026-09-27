package com.uniquindio.edu.Collections.Ejercicio1;

import java.time.LocalDate;
import java.util.TreeMap;

//**En una agenda de eventos, es fundamental organizar las actividades según 
// su fecha de realización. Para cumplir con este requerimiento, se usará un TreeMap, 
// que almacenará los eventos con sus respectivas fechas como clave, garantizando que siempre 
// se mantengan ordenados cronológicamente y permitiendo acceder de manera eficiente al evento 
// más próximo.
//  */
/**
 * Gestiona una agenda de eventos ordenada cronológicamente.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio1 {

    TreeMap<LocalDate, Evento> agenda = new TreeMap<>();
    LocalDate fechaActual = LocalDate.now();

    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();

        ejercicio1.agregarEvento(LocalDate.of(2026, 1, 15), "Conferencia de Tecnología", 150);
        ejercicio1.agregarEvento(LocalDate.of(2026, 1, 10), "Reunión de Negocios", 20);
        ejercicio1.agregarEvento(LocalDate.of(2026, 9, 24), "Fiesta de Cumpleaños", 50);

        ejercicio1.mostrarEventoProximo();
    }

    /** Registra un evento asociado a una fecha en la agenda. */
    /** @param fecha fecha de realización del evento */
    /** @param titulo título descriptivo del evento */
    /** @param invitados cantidad de personas invitadas */
    public void agregarEvento(LocalDate fecha, String titulo, int invitados) {
        Evento eventoNuevo = new Evento(titulo, invitados);
        agenda.put(fecha, eventoNuevo);

    }

    /** Muestra el primer evento cuya fecha no es anterior a la fecha actual. */
    public void mostrarEventoProximo() {
        LocalDate fechaProxima = agenda.ceilingKey(fechaActual);
        if (fechaProxima != null) {
            Evento eventoProximo = agenda.get(fechaProxima);
            System.out.println("El evento más próximo es: " + eventoProximo + " en la fecha: " + fechaProxima);
        } else {
            System.out.println("No hay eventos próximos.");
        }
    }

    /** Representa la información básica de un evento de la agenda. */
    public class Evento {
        /** Título del evento. */
        public String nombreEvento;
        /** Número de invitados al evento. */
        public int invitados;

        /** Crea un evento con su título y número de invitados. */
        /** @param nombreEvento título del evento */
        /** @param invitados cantidad de invitados */
        public Evento(String nombreEvento, int invitados) {
            this.nombreEvento = nombreEvento;
            this.invitados = invitados;
        }

        /** @return representación textual del evento */
        @Override
        public String toString() {
            return "Evento=" + nombreEvento + ", invitados=" + invitados;
        }

    }
}
