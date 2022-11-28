package cac.covid;

public class Persona {
    //temeperatura, nombre y dni

    private String nombre;
    private String dni; //no conviene usar int
    private double temperatura;

    public Persona(String nombre, String dni, double temperatura) {
        this.nombre = nombre;
        this.dni = dni;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}
