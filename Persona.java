package TP4;
/*
 * UCASAL - PROGRAMACION I
 * Autor/a: Morena Caparrós
 * ==========================
 * EJERCICIO 1
 * Crear una clase “Persona” con los siguientes atributos:
 * a. IdPersona: numérico entero
 * b. Dni: numérico entero
 * c. Apellido: cadena de texto
 * d. Nombre: cadena de texto
 * e. Edad: numérico entero
 * f. Género: texto
 * g. Peso: numérico con decimales
 * h. Altura: numérico con decimales
 * i. Domicilio: cadena de texto
 * ==================================================
 */
public class Persona {
    int idPersona;
    int dni;
    String apellido;
    String nombre;
    int edad;
    String genero;
    double peso;
    double altura;
    String domicilio;

    // Constructor de la clase Persona
    public Persona(int idPersona, int dni, String apellido, String nombre, int edad, String genero, double peso, double altura, String domicilio) {
        this.idPersona = idPersona;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.domicilio = domicilio;
    }

    /* Ejercicio 5  Crear los siguientes métodos de la clase Persona:
a. Info: Debe devolver una cadena que integre el DNI, Apellido, Nombre y Domicilio
b. IMC: Indice masa corporal. A partir del cálculo Peso en kg/Altura elevado al cuadrado
en m). Si el resultado es menor a 20 mostrar: “Debajo de su peso ideal”. Si el resultado
está entre 20 y 25 mostrar: “Está en su peso ideal”. Si es mayor a 25, mostrar
“Sobrepeso”.
c. esMayorDeEdad: indica si es mayor o igual a 18 años. Devuelve un valor booleano. */

    // Método para obtener información de la persona
    public String info() {
        return "DNI: " + dni + ", Apellido: " + apellido + ", Nombre: " + nombre + ", Domicilio: " + domicilio;
    }

    // Método para calcular el índice de masa corporal (IMC)
    public String imc() {
        double imcValue = peso / (altura * altura);
        if (imcValue < 20) {
            return "Debajo de su peso ideal";
        } else if (imcValue >= 20 && imcValue <= 25) {
            return "Está en su peso ideal";
        } else {
            return "Sobrepeso";
        }
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
