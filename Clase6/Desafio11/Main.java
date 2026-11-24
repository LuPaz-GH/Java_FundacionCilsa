package Clase6.Desafio11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Piloto> pilotos = new ArrayList<>();
        int opcion;

        do {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Registrar piloto");
            System.out.println("2. Mostrar pilotos");
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
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Numero del piloto: ");
                    while (!scanner.hasNextInt()) {
                        scanner.nextLine();
                        System.out.print("Numero invalido. Ingrese un numero: ");
                    }
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Equipo: ");
                    String equipo = scanner.nextLine();

                    System.out.print("Pais: ");
                    String pais = scanner.nextLine();

                    Piloto piloto = new Piloto(nombre, numero, equipo, pais);
                    pilotos.add(piloto);
                    System.out.println("Piloto registrado: " + piloto.getNombre());
                    break;
                case 2:
                    if (pilotos.isEmpty()) {
                        System.out.println("Todavia no hay pilotos registrados.");
                    } else {
                        for (int i = 0; i < pilotos.size(); i++) {
                            pilotos.get(i).mostrarInformacion();
                            System.out.println();
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
