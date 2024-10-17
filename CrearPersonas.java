package TP4;

/*
 * UCASAL - PROGRAMACION I
 * Autor/a: Morena Caparrós
 * ==========================
 * EJERCICIO 2
 * Crear objetos a partir de la clase “Persona”. Crear 5 personas.
 * ==================================================
 */

public class CrearPersonas {
    public Persona[] crearCincoPersonas() {
        Persona[] personas = new Persona[5];
        personas[0] = new Persona(1, 12345678, "Garcia", "Juan", 25, "Masculino", 70.0, 1.75, "Calle Falsa 123");
        personas[1] = new Persona(2, 23456789, "Perez", "Maria", 30, "Femenino", 60.0, 1.65, "Av. Siempre Viva 742");
        personas[2] = new Persona(3, 34567890, "Lopez", "Carlos", 40, "Masculino", 80.0, 1.80, "Calle Luna 456");
        personas[3] = new Persona(4, 45678901, "Martinez", "Ana", 35, "Femenino", 55.0, 1.60, "Av. Sol 789");
        personas[4] = new Persona(5, 56789012, "Rodriguez", "Luis", 28, "Masculino", 90.0, 1.85, "Calle Estrella 101");
        return personas;
    }

    public static void main(String[] args) {
        CrearPersonas creador = new CrearPersonas();
        Persona[] personas = creador.crearCincoPersonas();

        // Mostrar información de las personas creadas
        for (Persona persona : personas) {
            System.out.println(persona.info());
        }
    }
}
