package TP4;

/*
 * UCASAL - PROGRAMACION I
 * Autor/a: Morena Caparrós
 * ==========================
 * EJERCICIO 4
 * Con un bucle for, recorrer el arreglo y mostrar todos los datos de los objetos por pantalla.
 * ==================================================
 */

public class MostrarPersonas {
    public static void main(String[] args) {
        // Utilizar ArrayPersonas para crear las 10 personas
        ArrayPersonas arrayPersonas = new ArrayPersonas();
        Persona[] personas = arrayPersonas.crearDiezPersonas();

        // Mostrar información de las personas en el arreglo
        for (Persona persona : personas) {
            System.out.println("ID: " + persona.idPersona);
            System.out.println("DNI: " + persona.dni);
            System.out.println("Apellido: " + persona.apellido);
            System.out.println("Nombre: " + persona.nombre);
            System.out.println("Edad: " + persona.edad);
            System.out.println("Género: " + persona.genero);
            System.out.println("Peso: " + persona.peso);
            System.out.println("Altura: " + persona.altura);
            System.out.println("Domicilio: " + persona.domicilio);
            System.out.println();
        }
    }
}
