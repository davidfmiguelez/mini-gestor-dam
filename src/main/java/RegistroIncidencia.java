

import java.util.Scanner;

public class RegistroIncidencia {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Título de la incidencia: ");
        String titulo = scanner.nextLine();

        System.out.print("Descripción breve: ");
        String descripcion = scanner.nextLine();

        System.out.println("\n--- INCIDENCIA REGISTRADA ---");
        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
    }
}