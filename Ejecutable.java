package TP4;

import java.util.Scanner;

/*
 * UCASAL - PROGRAMACION I
 * Autor/a: Morena Caparrós
 * ==========================
 * EJERCICIO 6
 * Crear una clase ejecutable que haga lo siguiente:
 * a. Pedir al usuario el ingreso de los datos de 3 Personas, creando para cada una de ellas un objeto.
 * b. Para cada objeto deberá comprobar su IMC mostrando el resultado.
 * c. Para cada objeto deberá calcular si es Mayor de Edad, mostrando el resultado.
 * d. Para cada objeto mostrar la info del mismo
 * ==================================================
 */

public class Ejecutable {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Persona[] personas = new Persona[3];

        // Pedir al usuario el ingreso de los datos de 3 Personas
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = entrada.nextInt();
            System.out.print("DNI: ");
            int dni = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer
            System.out.print("Apellido: ");
            String apellido = entrada.nextLine();
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer
            System.out.print("Género: ");
            String genero = entrada.nextLine();
            System.out.print("Peso: ");
            double peso = entrada.nextDouble();
            System.out.print("Altura: ");
            double altura = entrada.nextDouble();
            entrada.nextLine(); // Limpiar el buffer
            System.out.print("Domicilio: ");
            String domicilio = entrada.nextLine();

            personas[i] = new Persona(id, dni, apellido, nombre, edad, genero, peso, altura, domicilio);
        }

        // Mostrar resultados
        for (Persona persona : personas) {
            System.out.println(persona.info());
            System.out.println("IMC: " + persona.imc());
            System.out.println("Mayor de Edad: " + (persona.esMayorDeEdad() ? "Sí" : "No"));
            System.out.println();
        }
    }
}
