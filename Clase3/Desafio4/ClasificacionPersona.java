package Clase3.Desafio4;

import java.util.Scanner;

public class ClasificacionPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1- Solicitar datos
        System.out.print("Ingresá tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresá tu edad: ");
        int edad = scanner.nextInt();

        // 2- Mostrar mensaje de bienvenida
        System.out.println();
        System.out.println("Bienvenido " + nombre + ".");
        System.out.println();

        // Estructura condicional para determinar si es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Estado: Mayor de edad.");
        } else {
            System.out.println("Estado: Menor de edad.");
        }

        scanner.close();
    }
}
