/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3ejercicios;

/**
 *
 * @author yoven
 */
public class Coche {
    String marca;
    String modelo;
    static int contadorCoches = 0; // Contador compartido por todos los coches

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Incrementar contador cada vez que se crea un coche
    }

    // Metodo estatico para mostrar el contador
    public static void mostrarContador() {
        System.out.println("Coches creados: " + contadorCoches);
    }

    public static void main(String[] args) {
        // Crear coches
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Focus");

        // Mostrar el numero de coches creados
        Coche.mostrarContador(); // Salida: Coches creados: 3
    }
}
