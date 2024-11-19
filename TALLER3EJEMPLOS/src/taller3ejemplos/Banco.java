/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3ejemplos;

/**
 *
 * @author yoven
 */
public class Banco {
    public static double tasaInteres = 0.05; // Atributo estático para la tasa de interés

    // Método estático que modifica la tasa de interés
    public static void modificarTasa(double nuevaTasa) {
        tasaInteres = nuevaTasa;
    }

    public static void main(String[] args) {
        Banco.modificarTasa(0.07); // Cambiar la tasa de interés
        System.out.println("Nueva tasa de interes: " + Banco.tasaInteres); // Salida: Nueva tasa de interes: 0.07
    }
}
