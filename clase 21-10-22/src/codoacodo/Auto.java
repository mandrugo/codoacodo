package codoacodo;

public class Auto {
    // lo puedo usar dentro de main porque sta dentro del main

    //propiedades o atributos
    //  private: solo lo voy a ver aca en la clase auto (es lo que se exige generalmente)
    // public: lo voy a ver en la clase auto y tambien desde cualquier otra clase o metodo
    //  protected: lo voy a ver en laclase auto y tambien lo pueden ver los hijos/as (jerarquias de clases)
    private String marca;
    private String modelo;
    private String color;
    private String patente;

    private String noVisible;

    //metodos o funciones
    //1.- contructor/es (como la new scanner es un constructor de scanners. Tambien podemos hacerlo nosotros)
    public Auto(){} //crea un auto sin nada en particular con alt+insert podemos crearlos con los parametros que querramos

    public Auto(String marca, String modelo){
        this.marca= marca;
        this.modelo= modelo;
    }

    //constructor realizado con alt+ insert o boton derecho->generar
    public Auto(String marca, String modelo, String color, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.patente = patente;
    }
    //creo autos con diferentes variantes.




    //2.- gets
    //3.- sets
    //se generan igual que los anteriores generar y elegir

    public String getMarca(){
        return this.marca; //retorna lo que tiene la marca, siver para mostrar la propiedad marca

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color; //funciones es cuando tengo un return
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }


    //4.- metodos privados para resolver particularidades de la clase

    private void setNoVisible(){
        this.noVisible = noVisible;

    }



    //5.- metodos de ..-


    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", patente='" + patente + '\'' +
                ", noVisible='" + noVisible + '\'' +
                '}';
    }
}
// esto anterior me retorna todo lo que declare