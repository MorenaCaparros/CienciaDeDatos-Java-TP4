package TP4;

/*
 * UCASAL - PROGRAMACION I
 * Autor/a: Morena Caparrós
 * ==========================
 * EJERCICIO 8
 * Instanciar 10 objetos de la clase “Profesor” y guardarlos en un arreglo.
 * ==================================================
 */

public class CrearProfesores {
    public Profesor[] crearDiezProfesores() {
        Profesor[] profesores = new Profesor[10];
        profesores[0] = new Profesor(1, 12345678, "Garcia", "Juan", 45, "Masculino", 70.0, 1.75, "Calle Falsa 123", "Matemáticas", 12);
        profesores[1] = new Profesor(2, 23456789, "Perez", "Maria", 50, "Femenino", 60.0, 1.65, "Av. Siempre Viva 742", "Física", 10);
        profesores[2] = new Profesor(3, 34567890, "Lopez", "Carlos", 40, "Masculino", 80.0, 1.80, "Calle Luna 456", "Química", 15);
        profesores[3] = new Profesor(4, 45678901, "Martinez", "Ana", 35, "Femenino", 55.0, 1.60, "Av. Sol 789", "Biología", 9);
        profesores[4] = new Profesor(5, 56789012, "Rodriguez", "Luis", 30, "Masculino", 90.0, 1.85, "Calle Estrella 101", "Historia", 8);
        profesores[5] = new Profesor(6, 67890123, "Dominguez", "Juan", 38, "Masculino", 75.0, 1.78, "Calle Larga 123", "Geografía", 14);
        profesores[6] = new Profesor(7, 78901234, "Fernandez", "Lucia", 42, "Femenino", 65.0, 1.65, "Av. Cortes 456", "Inglés", 13);
        profesores[7] = new Profesor(8, 89012345, "Gomez", "Miguel", 50, "Masculino", 85.0, 1.82, "Calle Ancha 789", "Educación Física", 16);
        profesores[8] = new Profesor(9, 90123456, "Sanchez", "Laura", 36, "Femenino", 58.0, 1.60, "Av. Principal 101", "Música", 11);
        profesores[9] = new Profesor(10, 91234567, "Rojas", "Federico", 44, "Masculino", 78.0, 1.74, "Calle Menor 202", "Arte", 10);

        return profesores;
    }

    public static void main(String[] args) {
        CrearProfesores creador = new CrearProfesores();
        Profesor[] profesores = creador.crearDiezProfesores();

        // Mostrar información de los profesores
        for (Profesor profesor : profesores) {
            System.out.println(profesor.info());
        }
    }
}
