package edu.codoacodo;

import java.util.ArrayList;

public class Seleccion {
    //nombre y lista de jugadores
    private String nombre;
    private ArrayList<Jugador> jugadores;



    //private DirectorTecnico tecnico;
    //private ArrayList<Asistentes> asistentes;
    //private ArrayList<Medicos> medicos;


    public Seleccion(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();


    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //agrego un obejeto jugador a la lista jugadores.
    // addjugador= nombre del metodo (Jugador= clase jugador= el jugador con parametros)
    public void addJugador(Jugador jugador) {
        //jugadores = lista
        jugadores.add(jugador);
    }

    //cantidad de jugadores y que reciba como parametro la posicion
    public int cantJugadoresPosicion(String posicion) {
        //creo un contador para ver la cantidad de posiciones
        int contador;
        //inicializo contador
        contador = 0;

        for (Jugador j : jugadores) {
            if (j.getPosicion().equals(posicion)) {
                contador++;

            }

        }

        for (int i=11; i<jugadores.size(); i++){
            System.out.println("numero camiseta del suplente es: " + jugadores.get(i).getNumeroDeCamiseta());
                                                                   //objeto jugador.metodo de la clase jugador(recupero jugador luego accedo a las propiedades).propiedad que queremos

            System.out.println("el nombre del jugador es  :" + jugadores.get(i).getNombre());
        }
        return contador;

    }

    //Public string cantJugadoresmayorA(int numeroDeCamiseta) {
    //   //creo un contador para ver la cantidad de posiciones
    //   int contador1;
    //   //inicializo1contador
    //   contador1 = 0;
    //
    //   for (Jugador j : jugadores) {
    //
    //       if (j.getNumeroDeCamiseta()>=numeroDeCamiseta) {
    //           contador1++;
    //
    //           nombreJugador = j.getNombre();
    //
    //       }
    //
    //   }
    //   return nombreJugador;
    //
    //
    //
    //
    //public int cantJugadoresmayorA(int numeroDeCamiseta) {
    //    //creo un contador para ver la cantidad de posiciones
    //    int contador1;
    //    //inicializo1contador
    //    contador1 = 0;
    //
    //    for (Jugador j : jugadores) {
    //
    //        if (j.getNumeroDeCamiseta()>=numeroDeCamiseta) {
    //            contador1++;
    //
    //            numeroJugador= j.getNumeroDeCamiseta();
    //        }
    //
    //    }
    //    return numeroJugador;
    //
    //
    //
    //}

}