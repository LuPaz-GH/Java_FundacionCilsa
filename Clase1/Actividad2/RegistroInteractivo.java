package Clase1.Actividad2;

import java.util.Scanner; // 	Traer la herramienta para que pueda usarla

public class RegistroInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Toma la herramienta y prepara para usar con el teclado

        System.out.println("==== Sistema de Registro ====");
        System.out.println();

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();  // nextLine se usa cada vez que quiera pedir un dato
        System.out.println();

        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();       // nextInt se usa cada vez que quiera pedir un dato
        scanner.nextLine(); // Sirve para que limpie el enter que quedo
        System.out.println();

        System.out.println("Ingrese su localidad: ");
        String localidad = scanner.nextLine();
        System.out.println();

        System.out.println("==============================");
        System.out.println();
        System.out.println("Registro creado correctamente.");
        System.out.println();
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Localidad: " + localidad);

        scanner.close();
    }
    
}
