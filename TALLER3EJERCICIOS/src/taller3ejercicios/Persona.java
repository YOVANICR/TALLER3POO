/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3ejercicios;

/**
 *
 * @author yoven
 */
public class Persona {
    String nombre; // Atributo no estatico

    // Metodo estatico (con error)
    public static void mostrarNombreIncorrecto() {
        // System.out.println("Nombre: " + nombre); // Esto genera un error de compilacion
    }

    // Metodo normal (correcto)
    public void mostrarNombreCorrecto() {
        System.out.println("Nombre: " + nombre); 
    }

    public static void main(String[] args) {
        System.out.println("Intentando usar un metodo estatico para acceder a un atributo no estatico...");


        // mostrarNombreIncorrecto();

        System.out.println("Corrigiendo el error...");
        Persona persona = new Persona();
        persona.nombre = "Juan"; 
        persona.mostrarNombreCorrecto(); 

      
    }
}
