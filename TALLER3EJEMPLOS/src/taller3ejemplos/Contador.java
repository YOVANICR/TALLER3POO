/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3ejemplos;

/**
 *
 * @author yoven
 */


//  Ejemplo Correcto 1: Atributo static Compartido entre Instancias

public class Contador {
    static int contadorGlobal = 0; // Atributo estático compartido por todas las instancias

    // Constructor que incrementa el contador global
    public Contador() {
        contadorGlobal++;
    }

    // Método estático para mostrar el valor del contador
    public static void mostrarContador() {
        System.out.println("Contador global: " + contadorGlobal);
    }

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        // Llamar al método estático usando el nombre de la clase
        Contador.mostrarContador(); // Salida: Contador global: 3
    }
}
