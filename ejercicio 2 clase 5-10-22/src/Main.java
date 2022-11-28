import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ejercicio 2:
        //definir 2 variables: nombre de usuario y contraseña.
        //van a pedir que ingrese por teclado usuario y contraseña.
        //comparar lo que ingresa por teclado con lo que hay en las variables.
        //si son correctos, mostras mensaje ingreso al sistema.-
        //sino. volver a pedir el nombre y contraseña

        String usuario, contrasenia, usuarioCorrecto, contraseniaCorrecta;

        System.out.println("ingrese usuario");
        usuario = sc.nextLine();

        System.out.println("ingrese contraseña");
        contrasenia = sc.nextLine();

        usuarioCorrecto = "hola";
        contraseniaCorrecta = "1234";

        if (Objects.equals(usuario, usuarioCorrecto)) {
            if (Objects.equals(contrasenia, contraseniaCorrecta)) {
                System.out.println("ingresando al sistema");
            }
        } else {
            System.out.println("ingrese usuario y contraseña correctos");
        }
    }
}