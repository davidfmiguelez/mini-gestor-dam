import java.util.Scanner;

public class PrioridadIncidencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la prioridad (1, 2 o 3): ");
        int numero = teclado.nextInt();
        
        String resultado = "";

        // Clasificación con condiciones
        if (numero == 1) {
            resultado = "BAJA";
        } else if (numero == 2) {
            resultado = "MEDIA";
        } else if (numero == 3) {
            resultado = "ALTA";
        } else {
            resultado = "NO VÁLIDA";
        }
        
        // Mensaje final de confirmación sugerido por mi compañero 
        if (resultado.equals("NO VÁLIDA")) {
            System.out.println("Error: Mensaje de nivel no válido.");
        } else {
            System.out.println("Confirmación: La prioridad asignada a la incidencia es " + resultado + ".");
        }
        
        teclado.close();
    }
}
