package edu.codoacodo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // el objeto teclado, que es de la clase scanner

        Auto miAuto = new Auto(); // objeto miAuto de la clase Auto
        Auto miSegundoAuto = new Auto("ford","focus");

        //ejemplo: crear un objeto usando la clase auto y el constructor vacio
        Auto miAutoTrabajo = new Auto();

        //ejemplo2: crear un objeto usando la clase auto y el constructor que tenga marca y modelo
        Auto miAutoPersonal = new Auto("ford","focus");

        //ejemplo3: crear un objeto usando la clase persona y el contructor con nombre y apellido
        Persona juan = new Persona("juan","pacheco");

        //clase 21/10/22

        //definir un arraylist de personas
        ArrayList<Persona> juan = new ArrayList<Persona>();



        //aagregar personas a mi array

        //mostrar los datos de las personas de mi array



    }
}