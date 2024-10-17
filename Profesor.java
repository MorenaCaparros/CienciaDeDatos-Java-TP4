package TP4;

/*
 * UCASAL - PROGRAMACION I
 * Autor/a: Morena Caparrós
 * ==========================
 * EJERCICIO 7
 * Crear la clase “Profesor”, que herede de la clase “Persona”, y además tenga los atributos:
 * a. Materia: cadena de texto
 * b. CargaHoraria: numérico entero
 * ==================================================
 */

public class Profesor extends Persona {
    String materia;
    int cargaHoraria;

    public Profesor(int idPersona, int dni, String apellido, String nombre, int edad, String genero, double peso, double altura, String domicilio, String materia, int cargaHoraria) {
        super(idPersona, dni, apellido, nombre, edad, genero, peso, altura, domicilio);
        this.materia = materia;
        this.cargaHoraria = cargaHoraria;
    }

    //la clase Profesor proporciona su propia implementación del método info, 
    //que es diferente (o adicional) a la implementación del método info en 
    //la clase Persona.
    @Override
    public String info() {
        // Llamar al método info() de la clase Persona y agregar información adicional de Profesor
        return super.info() + ", Materia: " + materia + ", Carga Horaria: " + cargaHoraria;
    }
}
