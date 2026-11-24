package Clase4.Desafio8;

import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Calcular promedio");
            System.out.println("2. Ayuda");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                opcion = -1;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuantas calificaciones desea ingresar? ");
                    int cantidad = scanner.nextInt();

                    if (cantidad <= 0) {
                        System.out.println("La cantidad debe ser mayor a 0.");
                        break;
                    }

                    double suma = 0;

                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("Ingrese la calificacion " + i + ": ");
                        double calificacion = scanner.nextDouble();
                        suma += calificacion;
                    }

                    double promedio = suma / cantidad;
                    System.out.println("Promedio: " + promedio);
                    break;
                case 2:
                    System.out.println("Ayuda: elegi la opcion 1, indica cuantas calificaciones");
                    System.out.println("vas a cargar e ingresalas una por una. El programa");
                    System.out.println("calculara el promedio. Elegi 3 para salir.");
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
