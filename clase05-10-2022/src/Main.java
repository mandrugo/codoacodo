import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaracion de variables
        int numero1, i;//variables


        //ingresar numero por teclado, se necesitan usar clases en este caso "escaner"
        Scanner sc = new Scanner(System.in); //sino esta cargada el scanner aparece en rojo, y
                                            // al llamarlo con esta linea apretamos alt  + enter



        // ingresar un valor entre 1 y 10
        //ejemplo: me ingresa el 3 --->4,5,6,7,8,9,10

        System.out.println("ingresar un elemento desde el 1 al 10:");
        numero1= sc.nextByte();

        i=numero1;
        while (i <= 10) {
            System.out.println(i);
            i++;

        }

        for(i=1;i<=10;i++) {
            System.out.println(i);
        }

        // mostrar los numeros pares entre 2 y 50
        i=2;

        for(i = 2; i<=50; i++){
            if (i % 2 ==0) {
                System.out.println("es para el valro: " + i);
            }

        }
        //ejercicio 1:
        //vamos al cine. todo el 5to grado y con algunos adultos.
        //comprar entradas y si es menor,  el valor de la entrada es de 500 y si es mayor es 700
        //existe un no seguir comprando entradas.
        //devolver como resultado: el valor total de costo de las entradas para menores y otro total
        // del costo de las entradas para mayores
        int edad, i;

        i=numero1;
        while (i <= 10) {
            System.out.println(i);
            i++;

        }

        //ejercicio 2:
        //definir 2 variables: nombre de usuario y contraseña.
        //van a pedir que ingrese por teclado usuario y contraseña.
        //comparar lo que ingresa por teclado con lo que hay en las variables.
        //si son correctos, mostras mensaje ingreso al sistema.-
        //sino. volver a pedir el nombre y contraseña


        //ejercicio 3:
        // lo mismo que en el ejercicio 2 pero agregar que la cantidad de intentos es 3
        //si el usuario y la contraseña se ingresa 3 veces mal. entonces mostrar el mensaje
        //cuenta bloqueada







    }

}

//
//        int i = 1;
//
//        while (i <=5){
//            System.out.println(i);
//            i++ ; //tambien podemos poner solo i++ o i = i + 1
//        }
//
//        for (i = 1; i<=5; i++){
//            System.out.println(i);
//        }