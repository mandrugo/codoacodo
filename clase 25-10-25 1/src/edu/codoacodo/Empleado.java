package edu.codoacodo;

public class Empleado {
    private String nombre;
    private String apellido;
    private String cargo;
    private String direccion;

    public Empleado(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo= "sin cargo definido";
        this.direccion="sin direccion definida";
    }

    public Empleado(String nombre, String apellido, String cargo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.direccion = direccion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    public void setApellido(){
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}