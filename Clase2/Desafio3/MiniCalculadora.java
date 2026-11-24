package Clase2.Desafio3;

import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= Calculadora =======");
        System.out.println();

        System.out.print("Primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println();

        System.out.print("Segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println();

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println();
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println();
        System.out.println("Multiplicación: " + (numero1 * numero2));
        System.out.println();

        // No se puede dividir por cero, Java tiraría un error
        if (numero2 != 0) {
            System.out.println("División: " + (numero1 / numero2)); // Entre dos int, / da la división entera
            System.out.println();
            System.out.println("Resto: " + (numero1 % numero2));  // % devuelve el resto de la división
            System.out.println();

            if (numero1 % numero2 == 0) { // Si el resto es 0, es divisible
                System.out.println("¿Es divisible?: Sí");
            } else {
                System.out.println("¿Es divisible?: No");
            }
        } else {
            System.out.println("División: no se puede dividir por cero");
            System.out.println();
            System.out.println("Resto: no se puede dividir por cero");
            System.out.println();
            System.out.println("¿Es divisible?: No");
        }
        System.out.println();

        // Un número es par si al dividirlo por 2 el resto es 0
        if (numero1 % 2 == 0) {
            System.out.println(numero1 + " es par");
        } else {
            System.out.println(numero1 + " es impar");
        }
        System.out.println();

        if (numero2 % 2 == 0) {
            System.out.println(numero2 + " es par");
        } else {
            System.out.println(numero2 + " es impar");
        }

        scanner.close();
    }
}
