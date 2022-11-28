package codoacodo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //clase 21/10/22

        //definir un arraylist de personas
        ArrayList<Persona> personas = new ArrayList<Persona>();



        //creamos personas para agregar a mi array
        Persona juan = new Persona();//creo una persona
        Persona pedro = new Persona();
        Persona lucas = new Persona("ramiro","pacheco");
        Persona ramiro = new Persona("ana","pacheco","123","yerbal");


        //agregamos a juan y pedro que son dos objetos de tipo persona
        personas.add(juan);
        personas.add(pedro);
        personas.add(lucas);
        personas.add(ramiro);
        //personas.add(new Persona("carlos", "romero")); //otra manera de ingresar las personas

        //definir el apellido a las personas
        juan.setApellido("Romero");
        pedro.setApellido("Garcia");


        //mostrar los apellidos de las personas de mi array
        for(Persona persona: personas){
            System.out.println(persona.toString());
        }


    }
}