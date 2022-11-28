public class Main {

    static int sumaEntero2() //Función sin parámetros
    {
        int suma = 5+5;
        return suma; //Acá termina la ejecución del método
        //return 5+5+5 ; // Si colocaramos algo luego del
        // return como por ejemplo otro
        // return, este  nunca se ejecutará
    }

    static String saludar(){
        return "Hola a todos";
    }
    static int sumar(){
        return 5+10;
    }

    static int sumar(int valor1, int valor2){
        return valor1+valor2;
    }

    static int sumar3num(int valor1, int valor2, int valor3){
        return valor1+valor2+valor3;
    }


    public static void main(String[] args) {

        System.out.println("el perimetro del circulo es : " + adf.perimetroCirculo(5));
        System.out.println("la superficie del cicurlo es: " + adf.superficieCirculo(5));

        String saludo = saludar();
        int suma = sumar();
        int suma2 = sumar(10,20);
        int sumar3 = sumar(20,30);
        int sumar4 = sumar(70,90);
        int resultado1 = sumar(100,200);
        resultado1= sumar(resultado1,300);

        int resultado2 = sumar3num(100,200,300);

        System.out.println(suma2);
        System.out.println(sumar3);
        System.out.println(sumar4);
        System.out.println(resultado1);
        System.out.println(resultado2);


    }
}