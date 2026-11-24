1package Clase3.Desafio6;

import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1- Mostrar el menu
        System.out.println("Menu");
        System.out.println();
        System.out.println("1 - Registrar persona");
        System.out.println("2 - Buscar persona");
        System.out.println("3 - Salir");
        System.out.println();

        // 2- Solicitar una opcion
        System.out.print("Ingresa una opcion: ");
        int opcion = scanner.nextInt();

        System.out.println();
        System.out.println("Opcion seleccionada: " + opcion);

        // 3- Mostrar un mensaje segun la opcion usando switch
        switch (opcion) {
            case 1:
                System.out.println("Mensaje: Seleccionaste Registrar persona.");
                break;
            case 2:
                System.out.println("Mensaje: Seleccionaste Buscar persona.");
                break;
            case 3:
                System.out.println("Mensaje: Seleccionaste Salir. Hasta luego!");
                break;
            default:
                System.out.println("Mensaje: Opcion invalida. Elegi 1, 2 o 3.");
                break;
        }

        scanner.close();
    }
}
