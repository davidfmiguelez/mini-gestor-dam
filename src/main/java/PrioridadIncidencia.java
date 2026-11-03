import java.util.Scanner;

public class PrioridadIncidencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la prioridad (1, 2 o 3): ");
        int numero = teclado.nextInt();
        
        // --- Clasificación con condiciones ---
        if (numero == 1) {
            System.out.println("BAJA");
        } else if (numero == 2) {
            System.out.println("MEDIA");
        } else if (numero == 3) {
            System.out.println("ALTA");
        } else {
            System.out.println("Mensaje de nivel no válido");
        }
        
        teclado.close();
    }
}
