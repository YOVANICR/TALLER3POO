/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3ejemplos;

/**
 *
 * @author yoven
 * 
 * Ejemplo Correcto 2: Método de Utilidad static
 */
public class Calculadora {
    // Método estático para sumar
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método estático para restar
    public static int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // Llamar a los métodos estáticos sin crear un objeto
        int suma = Calculadora.sumar(10, 5);
        int resta = Calculadora.restar(10, 5);

        // Mostrar los resultados
        System.out.println("Suma: " + suma);   // Salida: Suma: 15
        System.out.println("Resta: " + resta); // Salida: Resta: 5
    }
}