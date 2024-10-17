package TP4;

import java.util.Scanner;

/*
 * UCASAL - PROGRAMACION I
 * Autor/a: Morena Caparrós
 * ==========================
 * EJERCICIO 10
 * Investigue la clase Scanner en el lenguaje Java, e intégrela en un ejercicio que lo aplique.
 * ==================================================
 */

//Permitir al usuario buscar un profesor por su nombre y mostrar su información.
public class BuscadorProfesor {
    public static void main(String[] args) {
        // Crear un arreglo de profesores utilizando la clase CrearProfesores
        CrearProfesores creador = new CrearProfesores();
        Profesor[] profesores = creador.crearDiezProfesores();

        Scanner entrada = new Scanner(System.in);

        // Pedir al usuario que ingrese el nombre del profesor a buscar
        System.out.print("Ingrese el nombre del profesor a buscar: ");
        String nombreBuscado = entrada.nextLine();

        // Buscar el profesor por nombre y mostrar su información
        boolean encontrado = false;
        for (Profesor profesor : profesores) {
            if (profesor.nombre.equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Profesor encontrado:");
                System.out.println(profesor.info());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Profesor no encontrado con el nombre: " + nombreBuscado);
        }
    }
}