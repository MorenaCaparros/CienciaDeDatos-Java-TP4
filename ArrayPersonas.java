package TP4;

/*
 * UCASAL - PROGRAMACION I
 * Autor/a: Morena Caparrós
 * ==========================
 * EJERCICIO 3
 * Instanciar 10 objetos de la clase “Persona” y guardarlos en un arreglo.
 * ==================================================
 */

public class ArrayPersonas {
    public Persona[] crearDiezPersonas() {
        // Utilizar CrearPersonas para crear las primeras 5 personas
        CrearPersonas creador = new CrearPersonas();
        Persona[] primerasPersonas = creador.crearCincoPersonas();

        // Crear un arreglo para almacenar 10 objetos de la clase Persona
        Persona[] personas = new Persona[10];

        // Agregar las primeras 5 personas creadas
        for (int i = 0; i < 5; i++) {
            personas[i] = primerasPersonas[i];
        }

        // Agregar 5 personas adicionales manualmente
        personas[5] = new Persona(6, 67890123, "Dominguez", "Juan", 22, "Masculino", 75.0, 1.78, "Calle Larga 123");
        personas[6] = new Persona(7, 78901234, "Fernandez", "Lucia", 27, "Femenino", 65.0, 1.65, "Av. Cortes 456");
        personas[7] = new Persona(8, 89012345, "Gomez", "Miguel", 33, "Masculino", 85.0, 1.82, "Calle Ancha 789");
        personas[8] = new Persona(9, 90123456, "Sanchez", "Laura", 26, "Femenino", 58.0, 1.60, "Av. Principal 101");
        personas[9] = new Persona(10, 91234567, "Rojas", "Federico", 29, "Masculino", 78.0, 1.74, "Calle Menor 202");

        return personas;
    }

    public static void main(String[] args) {
        ArrayPersonas arrayPersonas = new ArrayPersonas();
        Persona[] personas = arrayPersonas.crearDiezPersonas();

        // Mostrar información de las personas en el arreglo
        for (Persona persona : personas) {
            System.out.println(persona.info());
        }
    }
}
