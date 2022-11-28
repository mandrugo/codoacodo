import cac.covid.Persona;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

// Para esto necesita pedir la temperatura de cada persona, el nombre y dni.
// El resultado del control debe listar (listado 1) a todas las personas que ingresaron (temperatura menor a 37 grados)
// y también listar las personas que no pudieron ingresar, indicando un mensaje que fue derivado a un hospital.
// Calcular el número de personas que ingresaron y el número de personas que no ingresar por presentar síntomas de covid.
// Para la implementacion, crear una clase Persona, crear un ArrayList de personas.
// La clase Persona debe estar definida dentro de un paquete que se llame cac.covid.

        ArrayList<Persona> participantesEvento = new ArrayList<Persona>();
        int menu = 0;
        String nombre, dni;
        double temperatura;

        //llamamos a las funciones

        /* esta es de la forma que no quiere el profe
        otra forma de calcular la cant de gente que no ingreso es declarando otra variable

        int cantidadNoIngresaron = participantesEvento.size() - cantidad;


        int cantidad = cantidadPersonasIngresaron(participantesEvento);
        System.out.println("la cantidad de personas que pudieron ingresar " + cantidad);
        System.out.println("la cantidad de personas que no pudieron igresar " + (participantesEvento.size()-cantidad);
        */


        participantesEvento = baseDatos1(); //cargo la base de datos 1 en el arraylist participantesEvento

        while (menu != 100){

            menu = Integer.parseInt(JOptionPane.showInputDialog("    Menu    " + " \n" +
                    "1.- Personas que ingresaron al evento" + "\n" +
                    "2.- Personas que no ingresaron al evento" + "\n" +
                    "3.- cantidad de Personas que ingresaron al evento" + "\n" +
                    "4.- cantidad de Personas que no ingresaron al evento" + "\n" +
                    "5.- Agregar Personas una persona" + "\n" +
                    "6.- Modificar una persona" + "\n" +
                    "7.- Quitar una persona del listado" + "\n" +
                    "8.- Listar todas las personas" + "\n" +
                    "100.- Salir"
            ));

            switch (menu){
                case 1: listaIngresaronParticipantesEventos(participantesEvento); break;
                case 2: listadoNoIngresaronAlEvento(participantesEvento); break;

                case 3:
                    System.out.println("las personas que ingresaron al evento son: " +
                            cantidadPersonasIngresaron(participantesEvento)); break;
                case 4:
                    System.out.println("la cantidad de personas que no ingresaron son " +
                            (participantesEvento.size() -cantidadPersonasIngresaron(participantesEvento))); break;
                    //tambien podemos hacer una variable int y hacer esta cuenta afuera de la funcion.

                case 5:
                    nombre = JOptionPane.showInputDialog("ingresa  el nombre del a persona");
                    dni = JOptionPane.showInputDialog("ingresa el dni de la persona");
                    temperatura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la temperatura"));
                    Persona per = new Persona(nombre, dni, temperatura);
                    participantesEvento.add(per);

                case 6:
                     dni = JOptionPane.showInputDialog("ingresa el dni de la persona que desea modificar");
                    for (Persona p: participantesEvento) {
                        if (p.getDni().equals(dni)) {
                            temperatura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nueva temperatura"));
                            p.setTemperatura(temperatura);
                            System.out.println("se modifico correctamente");
                            break;
                        }
                    }
                    break;


                case 7:


                case 8:
                    System.out.println(participantesEvento);
                default:
                    System.out.println("opcion no valida");

            }



        }




    }
    static ArrayList<Persona> baseDatos1(){
        ArrayList<Persona> listadoPersonas = new ArrayList<>();

        listadoPersonas.add(new Persona("ana","12312", 36.5 ));
        listadoPersonas.add(new Persona("ana2","12312", 35.5 ));
        listadoPersonas.add(new Persona("ana3","12312", 34.5 ));
        listadoPersonas.add(new Persona("ana4","12312", 35.6 ));
        listadoPersonas.add(new Persona("ana5","12312", 37.5 ));
        listadoPersonas.add(new Persona("ana6","12312", 37.5 ));
        listadoPersonas.add(new Persona("ana7","12312", 37.5 ));
        listadoPersonas.add(new Persona("ana8","12312", 37.5 ));
        listadoPersonas.add(new Persona("ana9","12312", 37.5 ));

        return listadoPersonas;
    }


    static void listaIngresaronParticipantesEventos(ArrayList<Persona> personas){
        for (Persona p: personas){
            if(p.getTemperatura() < 37.0){
                System.out.println(p.getNombre());
            }
        }
    }

    static int cantidadPersonasIngresaron(ArrayList<Persona> personas){
        int cantidadParticipantes = 0;

        for (Persona p: personas) {
            if(p.getTemperatura() < 37.0){
                cantidadParticipantes +=1;
            }
        }

        return cantidadParticipantes;
    }

    static void listadoNoIngresaronAlEvento(ArrayList<Persona> personas){
        System.out.println("las siguientes personas fueron derivados a un hospital:");
        for (Persona p: personas){
            if (p.getTemperatura() >= 37.0 ){
                System.out.println(p.getNombre());
            }
        }



    }
}