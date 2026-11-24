package Clase3.Desafio5;

import java.util.Scanner;

public class ClasificacionCalificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1- Solicitar datos
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu nota (0 a 10): ");
        int nota = scanner.nextInt();

        // 2- Rangos definidos:
        //    Excelente:   9 a 10
        //    Aprobado:    6 a 8
        //    Desaprobado: 0 a 5
        String resultado;

        if (nota < 0 || nota > 10) {
            resultado = "Nota invalida (debe estar entre 0 y 10)";
        } else if (nota >= 9) {
            resultado = "Excelente";
        } else if (nota >= 6) {
            resultado = "Aprobado";
        } else {
            resultado = "Desaprobado";
        }

        // 3- Mostrar resultado
        System.out.println();
        System.out.println(nombre);
        System.out.println();
        System.out.println("Nota: " + nota);
        System.out.println();
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
