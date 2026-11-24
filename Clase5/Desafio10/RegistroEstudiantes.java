package Clase5.Desafio10;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        ArrayList<String> localidades = new ArrayList<>();
        int opcion;

        do {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
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

                    System.out.print("Edad: ");
                    while (!scanner.hasNextInt()) {
                        scanner.nextLine();
                        System.out.print("Edad invalida. Ingrese un numero: ");
                    }
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Localidad: ");
                    String localidad = scanner.nextLine();

                    nombres.add(nombre);
                    edades.add(edad);
                    localidades.add(localidad);
                    System.out.println("Estudiante registrado/a.");
                    break;
                case 2:
                    if (nombres.isEmpty()) {
                        System.out.println("Todavia no hay estudiantes registrados.");
                    } else {
                        System.out.println("===== ESTUDIANTES =====");
                        for (int i = 0; i < nombres.size(); i++) {
                            System.out.println("Nombre: " + nombres.get(i));
                            System.out.println("Edad: " + edades.get(i));
                            System.out.println("Localidad: " + localidades.get(i));
                            System.out.println("-----------------------------");
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
