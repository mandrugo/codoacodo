import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio 3:
        // lo mismo que en el ejercicio 2 pero agregar que la cantidad de intentos es 3
        //si el usuario y la contraseña se ingresa 3 veces mal. entonces mostrar el mensaje
        //cuenta bloqueada
        Scanner sc = new Scanner(System.in);


        String usuario, contrasenia, usuarioCorrecto, contraseniaCorrecta;
        int i;



        usuarioCorrecto = "hola";
        contraseniaCorrecta = "1234";
        i=0;

        while(i<3) {
            System.out.println("ingrese usuario");
            usuario = sc.nextLine();

            System.out.println("ingrese contraseña");
            contrasenia = sc.nextLine();

            if (Objects.equals(usuario, usuarioCorrecto)) {
                if (Objects.equals(contrasenia, contraseniaCorrecta)) {
                    System.out.println("ingresando al sistema");
                }
            } else {
                System.out.println("ingrese usuario y contraseña correctos");
                i= i + 1;
            }

        }
    }
}