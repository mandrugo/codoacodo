package edu.codoacodo;

public class Main {
    public static void main(String[] args) {

        //creo el objeto seleccion dandole el nombre
        Seleccion Argentina = new Seleccion("Argentina");

        //primera forma de agregar jugardor
        Argentina.addJugador(new Jugador("Lionel", "Messi", "Delantero",10));
        Argentina.addJugador(new Jugador("Lionel", "Messi", "Delantero",10));
        Argentina.addJugador(new Jugador("Agustin", "Marchesin", "Arquero",12));
        Argentina.addJugador(new Jugador("Cristian", "Romero", "Defensor",13));
        Argentina.addJugador(new Jugador("Exequiel", "Palacios", "Defensor",14));
        Argentina.addJugador(new Jugador("Nicolas", "Gonzalez", "Delantero",16));




        //2da forma de agregar jugador
        Jugador jugador1 = new Jugador("Rodrigo", "De Paul", "Mediocampista",8);
        Argentina.addJugador(jugador1);


        System.out.println("los jugadores en la posicion indicada: " + Argentina.cantJugadoresPosicion("Defensor"));
        //calcular la cantidad de jugadores de reserva que son los jugadores con dorsal mayor a 12
        //devolver el numero de camiseta suplente

    }
}