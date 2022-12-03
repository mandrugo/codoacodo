import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        lo corregimos el 2/12/22
        hacer funciones:




         */
        Scanner sc = new Scanner(System.in);
        String palabra, palabra1, palabra2, palabra3, palabra4, palabra5, palabra6;

        /*//1.-  que pida una palabra de 8 caractares exactamente
        System.out.println("ingrese una palabra de 8 caracteres");
        palabra = sc.next();
        pide8Caracteres(palabra);
        */

        /*
        //2.-  que ingrese dos palabras y devuelva la mas larga
        System.out.println("ingrese dos palabras");
        palabra1 = sc.next();
        palabra2 = sc.next();
        dosPalabras(palabra1,palabra2);
        */

        /*
        3.-  ingresar 3 palabras y devuela una sola

        System.out.println("ingrese tres palabras a concatenar");
        palabra3 = sc.next();
        palabra4 = sc.next();
        palabra5 = sc.next();
        tresPalabras(palabra3, palabra4, palabra5);
        */

        /*
        4.-  ingresar una palabra que cuente cuantas vocales a tiene
         */
        System.out.println("ingrese una palabra con muchas vocales");
        palabra6 = sc.next();
        contarPalabraA(palabra6);

    }

    static void pide8Caracteres(String palabra) {

        int contadorLetras = 0;
        for (int i = 0; i <= palabra.length() - 1; i++) {
            contadorLetras++;
        }
        if (contadorLetras == 8) {
            System.out.println("Total letras=" + contadorLetras);
        } else {
            System.out.println("su palabra no tiene 8 caracteres exactamente");
        }


    }


    static void dosPalabras(String palabra1, String palabra2) {

        int contadorLetras1 = 0;
        for (int i = 0; i <= palabra1.length() - 1; i++) {
            contadorLetras1++;
        }
        int contadorLetras2 = 0;
        for (int i = 0; i <= palabra2.length() - 1; i++) {
            contadorLetras2++;
        }

        if (contadorLetras1 > contadorLetras2) {
            System.out.println("la palabra mas larga es " + palabra1);
        } else {
            System.out.println("la palabra mas larga es " + palabra2);
        }

    }

    static void tresPalabras(String palabra3, String palabra4, String palabra5) {
        System.out.println(palabra3 + palabra4 + palabra5);
    }

    static void contarPalabraA(String palabra6) {
        int contadorVocales = 0;
        for (int i = 0; i <= palabra6.length() - 1; i++) {
            char pal6 = palabra6.charAt(i);
            if (pal6 == 'a' || pal6 == 'e' || pal6 == 'i' || pal6 == 'o' || pal6 == 'u') {
                contadorVocales++;
            }


        }
        System.out.println(contadorVocales);

    }
}