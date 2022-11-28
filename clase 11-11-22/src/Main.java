import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion;
        Scanner teclado = new Scanner(System.in);

        //Realizar un arraylist donde mediante una función cargarNotas se puedan cargar los datos vía teclado.
        ArrayList<Double> notasComision22929 = new ArrayList<>();
        notasComision22929 = cargarNotas();
        //Programar una función que arroje el promedio de las notas cargadas.
        Double promedioNotas1;
        promedioNotas1 = promedioNotas(notasComision22929);
        System.out.println("el promedio de las notas de la comision 22929: " + promedioNotas1);

        //Colocar toda la estructura anterior dentro de switch cuyos menúes sean:
        //Visualizar los datos cargados
        //Obtener el promedio

        System.out.println("ingrese la opcion deseada, 1: mostrar notas cargadas /2-mostrar promedio de notas");

        opcion = teclado.nextInt();

        switch (opcion ){
            case 1: cargarNotas(notasComision22929);
            break;
            case 2: promedioNotas1(notasComision22929);
            break;
            default:
                System.out.println("ingreso una opcion inválida");

        }



    }
    static void mostrarNotas(ArrayList<Double> notas)



    //hago la funcion cargarNotas. las funciones van afuera del main
    static ArrayList <Double> cargarNotas () {
        double nota;
        Scanner leer = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();
        System.out.println("ingrese 10 notas: ");
        for (int i = 0; i < 10; i++){
            nota = leer.nextDouble(); //para ingresar por teclado
            notas.add(nota);
        }
        return notas;
    }


    static Double promedioNotas(ArrayList<Double> notas){
        //teenemos que recorre los arrayList y sumar las notas
        //luego dividir por la cantidad de elementos uqe tengo en el arrayList
        Double sumaNotas=0.0;

        //recorremos notas y recupero cada una de las nota del arraylist
        for (Double nota:notas) {
            sumaNotas+= nota;

        }
        return (sumaNotas/notas.size()); //ahora tengo el promedio
        //depues del return no lee nada el codigo
    }

    //Colocar la función cargaNotas dentro de un bucle while
    // que pregunte si deseo cargar otro dato.
    static ArrayList <Double> cargarNotas2 () {
        double nota;
        int seguir = 1;
        Scanner leer = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        while (seguir == 1){
            System.out.println("ingrese notas: ");
            nota = leer.nextDouble(); //para ingresar por teclado
            notas.add(nota);
            System.out.println("desea seguir cargando? 1- si /cualquier otro numero -no" );
            seguir= leer.nextInt();
        }
        return notas;
    }


}