import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //


        //creo un array con nombre productosSuper
        ArrayList<String> productosSuper = new ArrayList<String>(); //lleva () porque es un constructor
        ArrayList<Integer> segundoArray = new ArrayList<Integer>();


        //le ingreso los produuctos de mi lista
        productosSuper.add("palmitos"); //sino le pongo una posicion estaria en la primera posicion
        productosSuper.add("cafe");
        productosSuper.add("matecocido");


        // recorro la lista.
        for (String producto : productosSuper) {
            System.out.println(producto);
        }
        //declaro variables para mostrar otra manera de mostrar el arraylist
        int i;
        //otro metodo para mostrar el array list
        for (i = 0; i < productosSuper.size(); i++) {
            System.out.println("la posicion es: " + i);
            System.out.println("producto en esa posicion: " + productosSuper.get(i));

        }

        for (Integer elemento: segundoArray) {
            System.out.println(segundoArray.get(i));
        }

        Iterator<String> it= productosSuper.iterator();
        while (it.hasNext()) {
            System.out.println(segundoArray.get(i));
        }

    }




}