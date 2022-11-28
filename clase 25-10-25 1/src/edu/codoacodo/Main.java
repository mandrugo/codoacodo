package edu.codoacodo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1-crear un proyecto

        //2-crear una clase: Empleados
        //              nombre, apellido, cargo. direccion
        //3-crear una clase: EquipoFutbol
        //              nombre y direccion, cantidadJugadores, Campeonatos
        //4- crear Objetos: 2 Empleados y dos EquipoFutbol

        EquipoFutbol boca = new EquipoFutbol("boca", "la boca");
        EquipoFutbol river = new EquipoFutbol("river", "monumental");

        Empleado empleado1 = new Empleado("juan", "garcia");
        Empleado empleado2 = new Empleado("rodrigo", "perez");

        //5- Crear un Array: que tenga empleados
        //6- Crear un Array: que tenga EquiposFutbol
        ArrayList<Empleado> empleadosEmpresaA = new ArrayList<Empleado>();
        ArrayList<EquipoFutbol> equiposDePrimera = new ArrayList<EquipoFutbol>();

        Empleado empleado3= new Empleado("jorge", "ramirez", "operario", "neuquen");

        empleadosEmpresaA.add(empleado1);
        empleadosEmpresaA.add(empleado2);

        equiposDePrimera.add(boca);
        equiposDePrimera.add(river);
        EquipoFutbol equipo1 = new EquipoFutbol("san lorenzo", "gasometro", 50, 20);

        //7- Calcular cuantos empleados hay y cuantos equiposFutbol
        System.out.println("la cantidad de empleados son: " + empleadosEmpresaA.size());
        System.out.println("la cantidad de equipos son: " + equiposDePrimera.size());

        //8-listar los nombres de los empleados

        for(Empleado e:empleadosEmpresaA){
            //cuando el cargo sea operario
            System.out.println("El nombre del empleado es " + e.getNombre());
        }



        //9-listar los nombres de los equos de futbol
        for(EquipoFutbol f:equiposDePrimera){
            //cuando el equipo tenga mas de 20 jugadores
            System.out.println("los nombres de equipos son " + f.getNombre());
        }


        //10-listar todas las propiedades del Empleado y el EquipoFutbol

        for(Empleado e:empleadosEmpresaA){

            System.out.println("propiedades: " + e.toString());
        }

        for(EquipoFutbol e:equiposDePrimera){
            System.out.println("propiedades: " + e.toString());
        }

    }
}