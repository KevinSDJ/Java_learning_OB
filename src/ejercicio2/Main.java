package ejercicio2;

public class Main {

    public static void main(String[] args){
        double iva= 3.80;
        double result= precioFinal(2.3,iva);
        System.out.println(result);
    }
    static double precioFinal(double precio , double iva){
        return precio + iva;
    }
}
