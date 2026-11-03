import java.util.Scanner;

public class PrioridadIncidencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Pedir un número 1, 2 o 3
        System.out.print("Introduce la prioridad (1, 2 o 3): ");
        int numero = teclado.nextInt();
        
        teclado.close();
    }
}
