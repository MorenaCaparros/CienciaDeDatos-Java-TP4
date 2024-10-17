package TP4;

/*
 * UCASAL - PROGRAMACION I
 * Autor/a: Morena Caparrós
 * ==========================
 * EJERCICIO 9
 * Con un bucle for, recorrer el arreglo del punto 8 completo y mostrar por pantalla todos los
 * datos de los Profesores que tengan Carga Horaria mayor a 10.
 * ==================================================
 */

public class ProfesoresConCargaHoraria {
    public static void main(String[] args) {
        CrearProfesores creador = new CrearProfesores();
        Profesor[] profesores = creador.crearDiezProfesores();

        // Mostrar información de los profesores con carga horaria mayor a 10
        for (Profesor profesor : profesores) {
            if (profesor.cargaHoraria > 10) {
                System.out.println(profesor.info());
            }
        }
    }
}
