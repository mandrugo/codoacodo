package edu.codoacodo;

public class Jugador {
    //nombre y apellido, n° de camiseta, posicion delantero meidocampitas, defensor,arquero
    private String nombre;
    private String apellido;
    private String posicion;
    private int numeroDeCamiseta;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Jugador(String nombre, String apellido, String posicion, int numeroDeCamiseta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numeroDeCamiseta = numeroDeCamiseta;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(int numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", posicion='" + posicion + '\'' +
                ", numeroDeCamiseta=" + numeroDeCamiseta +
                '}';
    }


}
