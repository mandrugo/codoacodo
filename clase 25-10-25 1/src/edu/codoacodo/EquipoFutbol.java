package edu.codoacodo;

public class EquipoFutbol {

    private String nombre;
    private String direccion;

    // agrego cantidadJugadores, Campeonatos
    private int cantidadJugadores;
    private int Campeonatos;
    public EquipoFutbol(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public EquipoFutbol(String nombre, String direccion, int cantidadJugadores, int campeonatos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadJugadores = cantidadJugadores;
        this.Campeonatos = campeonatos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public int getCampeonatos() {
        return Campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        Campeonatos = campeonatos;
    }

    @Override
    public String toString() {
        return "EquipoFutbol{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cantidadJugadores=" + cantidadJugadores +
                ", Campeonatos=" + Campeonatos +
                '}';
    }
}
