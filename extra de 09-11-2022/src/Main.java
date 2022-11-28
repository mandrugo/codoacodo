public class Main {
    public static void main(String[] args) {

        int x, y, resultado;
        x=5;
        y=0;
        resultado = 0;

        try{
            resultado = x/y;

        }catch (ArithmeticException ex){
            resultado =0;
            System.out.println("error: " + ex.getMessage());

        }finally {
            System.out.println("resultado de la division "+ resultado);
        }



    }
}