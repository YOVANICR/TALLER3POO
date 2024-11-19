/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3ejemplos;

/**
 *
 * @author yoven
 * 
 * Ejemplo Incorrecto 1: Intentar Acceder a Atributos No Estáticos desde un Método static
 * 
 */
public class Persona {
    private String nombre; // Atributo no estático

    // Método estático que intenta acceder al atributo no estático
    public static void mostrarNombre() {
        // System.out.println("Nombre: " + nombre); // Esto genera un error
    }

    public static void main(String[] args) {
        System.out.println("Este código no compila porque un método estático no puede usar atributos no estáticos.");
    }
}
