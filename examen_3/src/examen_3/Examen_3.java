/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_3;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Examen_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
    
System.out.print("cuantos estudantes tienes: ");
     int numEstudiantes = captu.nextInt();

     if (numEstudiantes <= 0) {
            System.out.println("el numero de estudiantes es invalido");
            return;
        }
     
        double[] calificaciones = new double[numEstudiantes];
        
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("cual es la calificacion del estudiante " + (i + 1) + " (entre 0 y 100): ");
            double calificacion = captu.nextDouble();

            if (calificacion < 0 || calificacion > 100) {
                System.out.println("La calificacion deben de estar entre 0 y 100.");
                i--; 
            } else {
                calificaciones[i] = calificacion;
            }
        }

        
        double promedio = calculoPromedio(calificaciones);
        int mayorOigual = contarLaMasAlta(calificaciones, promedio);
        double califaMasAlta = obtenerLaMasAlta(calificaciones);
        double califaMasBaja = obtenerMasBaja(calificaciones);
        System.out.println("resultados:");
        System.out.println("promedio de las calificaciones: " + promedio);
        System.out.println("calificaciones mayores o iguales al promedio: " + mayorOigual);
        System.out.println("la calificaion mas alta: " + califaMasAlta);
        System.out.println("la calificaion mas baja: " + califaMasBaja);

     
    }

    public static double calculoPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public static int contarLaMasAlta(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static double obtenerLaMasAlta(double[] calificaciones) {
        double max = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > max) {
                max = calificacion;
            }
        }
        return max;
    }

    public static double obtenerMasBaja(double[] calificaciones) {
        double min = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < min) {
                min = calificacion;
            }
        }
        return min;
    }

   
  
    }
    

