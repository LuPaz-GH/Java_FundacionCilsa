package Clase4.Desafio7;

import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Registrar persona");
            System.out.println("2. Mostrar mensaje de bienvenida");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                opcion = -1;
            }
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Persona registrada: " + nombre);
                    break;
                case 2:
                    System.out.println("¡Bienvenido/a al sistema!");
                    break;
                case 3:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion no valida. Elegi 1, 2 o 3.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}
