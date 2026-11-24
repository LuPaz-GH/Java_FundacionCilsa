package Clase4.Desafioavanzado2;

import java.util.Scanner;

public class AnalisisCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1. Ingresar y analizar calificaciones");
            System.out.println("2. Mostrar informacion");
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
                    int aprobados = 0;

                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("Ingrese la calificacion " + i + ": ");
                        double nota = scanner.nextDouble();

                        while (nota < 0 || nota > 10) {
                            System.out.print("Calificacion invalida. Ingrese un valor entre 0 y 10: ");
                            nota = scanner.nextDouble();
                        }

                        suma += nota;
                        if (nota >= 6) {
                            aprobados++;
                        }
                    }

                    double promedio = suma / cantidad;
                    System.out.println();
                    System.out.println("Promedio general: " + promedio);
                    System.out.println("Cantidad de aprobados: " + aprobados);

                    if (aprobados == cantidad) {
                        System.out.println("¡Felicitaciones! Todas las notas estan aprobadas.");
                    } else {
                        System.out.println("No todas las notas estan aprobadas ("
                                + (cantidad - aprobados) + " desaprobada/s).");
                    }
                    break;
                case 2:
                    System.out.println("Informacion: este programa analiza un conjunto de calificaciones.");
                    System.out.println("- Cada nota debe estar entre 0 y 10.");
                    System.out.println("- Una nota se considera aprobada si es mayor o igual a 6.");
                    System.out.println("- Se muestra el promedio, la cantidad de aprobados");
                    System.out.println("  y si todas las notas estan aprobadas.");
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
