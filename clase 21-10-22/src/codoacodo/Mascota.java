package codoacodo;

public class Mascota {
    private String raza;
    private String nombre;
    private String sexo;
    private String color;

    public Mascota(String raza, String nombre, String sexo, String color) {
        this.raza = raza;
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
