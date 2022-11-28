import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo, de megde");

        System.out.println("hola mundo, de megde");

        //declaracion de variables
        int numero1, numero2;//variables
        String nombre; //esto es un objeto. Los objetos se crean a partir de clases es mas que una variable

        //ingresar numero por teclado, se necesitan usar clases en este caso "escaner"
        Scanner sc = new Scanner(System.in); //sino esta cargada el scanner aparece en rojo, y
        // al llamarlo con esta linea apretamos alt  + enter

        System.out.println("ingrese un numero");
        numero1= sc.nextByte(); //es el leer de pseint
        System.out.println("ingrese otro numero");
        numero2=sc.nextByte(); //leer


        nombre = "java";

        System.out.println("el resultado de la suma es: " + (numero1 + numero2));
        System.out.println("el resultado de la resta es : " + (numero1 - numero2));
        System.out.println("el resultado de la multiplicacion es: " + (numero1 * numero2));
        System.out.println("el resultado del a division es: " + (numero1/numero2));
        System.out.println("estamos trabajando en " + nombre);

        if(numero1>numero2) {
            System.out.println("el numero mayuoer es: " + numero1);
        }else{
            if (numero2 > numero1){
                System.out.println("el numero mayor es: " + numero2);
            }else{
                System.out.println("los numeros son iguales");
            }
        }
        if(numero1 % 2 == 0){ //es par
            System.out.println("es numero par");
        }else{
            System.out.println("es numero impar");
        }

        int i = 1;

        while (i <=5){
            System.out.println(i);
            i++ ; //tambien podemos poner solo i++ o i = i + 1
        }

        for (i = 1; i<=5; i++){
            System.out.println(i);
        }

    }
}