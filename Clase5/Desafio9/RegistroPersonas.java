package Clase5.Desafio9;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroPersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> personas = new ArrayList<>();
        int opcion;

        do {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Registrar persona");
            System.out.println("2. Mostrar personas");
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
                    personas.add(nombre);
                    System.out.println("Persona registrada: " + nombre);
                    break;
                case 2:
                    if (personas.isEmpty()) {
                        System.out.println("Todavia no hay personas registradas.");
                    } else {
                        System.out.println("===== PERSONAS REGISTRADAS =====");
                        for (int i = 0; i < personas.size(); i++) {
                            System.out.println((i + 1) + ". " + personas.get(i));
                        }
                    }
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
