import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //ejercicio 1:
        //vamos al cine. todo el 5to grado y con algunos adultos.
        //comprar entradas y si es menor,  el valor de la entrada es de 500 y si es mayor es 700
        //existe un no seguir comprando entradas.
        //devolver como resultado: el valor total de costo de las entradas para menores y otro total
        // del costo de las entradas para mayores
    try(Scanner sc = new Scanner(System.in)) {

        int i, edad, costoTotalMenores, costoTotalMayores, dineroTotal;


            System.out.println("ingrese el dinero total disponible");
            dineroTotal = sc.nextInt();

            costoTotalMayores = 0;
            costoTotalMenores = 0;
            i  = 0;

            do {

                System.out.println("ingrese la edad del cliente");
                edad = sc.nextInt();

                    if (edad >= 18) {
                        i = i + 700;
                        costoTotalMayores = costoTotalMayores + 700;

                    }else{
                        i = i + 500;
                        costoTotalMenores = costoTotalMenores + 500;

                    }
            } while (i >= dineroTotal);

            System.out.println("el costo total de mayores es= " + costoTotalMayores );
            System.out.println("el costo total de menores es= " + costoTotalMenores );
        }
    }
}