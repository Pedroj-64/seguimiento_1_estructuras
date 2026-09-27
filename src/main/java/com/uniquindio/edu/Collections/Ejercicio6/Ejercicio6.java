package com.uniquindio.edu.Collections.Ejercicio6;

import java.util.HashSet;

//**En un edificio con control de acceso, 
// los empleados deben identificarse mediante un código único para poder ingresar. 
// Para gestionar estos accesos sin permitir duplicados, se utilizará un HashSet,
//  donde cada ID de empleado será almacenado y verificado antes de permitir la entrada.
//  */
/**
 * Controla empleados identificados mediante códigos únicos.
 *
 * @author Pedro Jose Soto Rivera
 */
public class Ejercicio6 {
    /** Empleados autorizados, sin identificadores repetidos. */
    HashSet<Empleado> empleados = new HashSet<>();
    public static void main(String[] args) {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        ejercicio6.agregarEmpleados(new Empleado("001", "Juan"));
        ejercicio6.agregarEmpleados(new Empleado("002", "María"));
        ejercicio6.agregarEmpleados(new Empleado("003", "Pedro"));
    }

    /** Agrega un empleado únicamente si su identificador no está registrado. */
    /** @param empleado empleado que se desea registrar */
    public void agregarEmpleados(Empleado empleado){
        if(!empleados.contains(empleado)){
            empleados.add(empleado);
        }
    }

    /** Representa a un empleado identificado por un código único. */
    public static class Empleado {
        /** Código identificador del empleado. */
        String idEmpleado;
        /** Nombre del empleado. */
        String nombreEmpleado;

        /** Crea un empleado. */
        /** @param idEmpleado identificador del empleado */
        /** @param nombreEmpleado nombre del empleado */
        public Empleado(String idEmpleado, String nombreEmpleado) {
            this.idEmpleado = idEmpleado;
            this.nombreEmpleado = nombreEmpleado;
        }

        /** Considera iguales los empleados con el mismo identificador. */
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Empleado empleado = (Empleado) obj;
            return idEmpleado.equals(empleado.idEmpleado);
        }

        /** @return hash basado en el identificador del empleado */
        @Override
        public int hashCode() {
            return idEmpleado.hashCode();
        }
    }
}
