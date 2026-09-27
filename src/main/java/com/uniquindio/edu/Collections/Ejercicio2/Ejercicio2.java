package com.uniquindio.edu.Collections.Ejercicio2;
//**

// En un hospital, los pacientes deben ser atendidos según la gravedad de su condición,
//  con los más urgentes siendo tratados primero. Para manejar esto, 
// se implementará una PriorityQueue, donde cada paciente será ingresado con un nivel de 
// prioridad y el sistema garantizará que aquellos con mayor urgencia sean 
// atendidos antes que los demás. */

import java.util.PriorityQueue;

/**
 * Atiende pacientes mediante una cola de prioridad.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio2 {

    PriorityQueue<Paciente> triage = new PriorityQueue<>();

    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();

        ejercicio2.agregarPaciente("Juan Perez", 3);
        ejercicio2.agregarPaciente("Maria Lopez", 1);
        ejercicio2.agregarPaciente("Carlos Sanchez", 2);

        ejercicio2.atenderPacientes();

    }

    /** Añade un paciente a la cola de triage. */
    /** @param nombre nombre del paciente */
    /** @param prioridad nivel de urgencia; un valor mayor se atiende primero */
    public void agregarPaciente(String nombre, int prioridad) {
        Paciente pacienteNuevo = new Paciente(nombre, prioridad);
        triage.add(pacienteNuevo);
    }

    /** Atiende pacientes hasta vaciar la cola, respetando su prioridad. */
    public void atenderPacientes() {
        while (!triage.isEmpty()) {
            Paciente pacienteAtendido = triage.poll();
            System.out.println("Atendiendo a: " + pacienteAtendido);
        }
    }

    /** Modelo de un paciente ordenable por nivel de prioridad. */
    public class Paciente implements Comparable<Paciente> {
        /** Nombre del paciente. */
        public String nombrePaciente;
        /** Nivel de prioridad del paciente. */
        public int prioridad;

        /** Crea un paciente. */
        /** @param nombrePaciente nombre del paciente */
        /** @param prioridad nivel de prioridad */
        public Paciente(String nombrePaciente, int prioridad) {
            this.nombrePaciente = nombrePaciente;
            this.prioridad = prioridad;
        }

        /** @return representación textual del paciente */
        @Override
        public String toString() {
            return "Paciente=" + nombrePaciente + ", prioridad=" + prioridad;
        }

        /** Ordena de mayor a menor prioridad. */
        /** @param other paciente con el que se compara */
        /** @return resultado de la comparación */
        @Override
        public int compareTo(Paciente other) {
            return Integer.compare(other.prioridad, this.prioridad);
        }
    }
}
