package Clase2.Desafioavanzado1;

import java.util.Scanner;

public class CalculadoraAvanzada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= Calculadora =======");
        System.out.println();

        System.out.print("Primer número: ");
        int numero1 = scanner.nextInt(); // numero1 -> int
        System.out.println();

        System.out.print("Segundo número: ");
        int numero2 = scanner.nextInt(); // numero2 -> int
        System.out.println();

        // suma -> int (int + int da int)
        int suma = numero1 + numero2;
        System.out.println("Suma: " + suma);
        System.out.println();

        // resta -> int
        int resta = numero1 - numero2;
        System.out.println("Resta: " + resta);
        System.out.println();

        // multiplicacion -> int
        int multiplicacion = numero1 * numero2;
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println();

        // potencia -> double (Math.pow siempre devuelve double)
        double potencia = Math.pow(numero1, numero2);
        System.out.println("Potencia: " + potencia);
        System.out.println();

        // potenciaEntera -> int (casting explícito: de double a int se pierden los decimales,
        // por eso Java obliga a poner (int))
        int potenciaEntera = (int) Math.pow(numero1, numero2);
        System.out.println("Potencia (entera): " + potenciaEntera);
        System.out.println();

        // promedio -> double (casting explícito: si dividiera int / int perdería los decimales,
        // entonces convierto la suma a double antes de dividir)
        double promedio = (double) suma / 2;
        System.out.println("Promedio: " + promedio);
        System.out.println();

        // No se puede dividir por cero
        if (numero2 != 0) {
            // divisionEntera -> int (int / int da int, se descartan los decimales)
            int divisionEntera = numero1 / numero2;
            System.out.println("División entera: " + divisionEntera);
            System.out.println();

            // divisionDecimal -> double (casting explícito: convierto numero1 a double
            // para que la división se haga con decimales)
            double divisionDecimal = (double) numero1 / numero2;
            System.out.println("División decimal: " + divisionDecimal);
            System.out.println();

            // resto -> int
            int resto = numero1 % numero2;
            System.out.println("Resto: " + resto);
            System.out.println();

            // esDivisible -> boolean (una comparación da true o false)
            boolean esDivisible = resto == 0;
            if (esDivisible) {
                System.out.println("¿Es divisible?: Sí");
            } else {
                System.out.println("¿Es divisible?: No");
            }
        } else {
            System.out.println("División entera: no se puede dividir por cero");
            System.out.println();
            System.out.println("División decimal: no se puede dividir por cero");
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
