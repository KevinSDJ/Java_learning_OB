import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();
        System.out.printf("Nombre: %s, Edad: %s.\n",nombre,edad);
        System.out.println("Gracias");
    }
}
