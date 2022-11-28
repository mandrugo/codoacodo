package codoacodo;

public class Escuela {

    private String nombre;
    private String direccion;
    private String localidad;
    private String nivel;


    public Escuela(String nombre, String direccion, String localidad, String nivel) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}

