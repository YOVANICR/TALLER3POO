/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3ejercicios;

/**
 *
 * @author yoven
 */
public class Matematicas {
    // Metodos estaticos para operaciones
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0; // Evitar division entre cero
    }

    public static void main(String[] args) {
        // Llamar a los metodos y mostrar resultados
        System.out.println("Suma: " + Matematicas.sumar(5, 3));          // Salida: Suma: 8
        System.out.println("Resta: " + Matematicas.restar(10, 4));      // Salida: Resta: 6
        System.out.println("Multiplicacion: " + Matematicas.multiplicar(2, 3)); // Salida: Multiplicacion: 6
        System.out.println("Division: " + Matematicas.dividir(10, 2));  // Salida: Division: 5.0
    }
}
