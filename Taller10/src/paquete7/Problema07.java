/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema07 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int filas = 3;
        int columnas = 3;
        int[][] matrizX = new int[filas][columnas];
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        boolean identidadSeCumple = true;
        
        System.out.printf("Ingrese los valores para la matriz X (%dx%d):\n"
                , filas
                , columnas);
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.printf("X[%d][%d]: ", i, j);
                matrizX[i][j] = entrada.nextInt();
            }
        }
        
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                int x = matrizX[i][j];
                 matrizA[i][j] = (x + 1) * (x + 1);
            }
        }
        
         for (int i = 0; i < filas; i++){
             for (int j = 0; j < columnas; j++){
                 int x = matrizX[i][j];
                  matrizB[i][j] = x * x + 2 * x + 1;
             }
         }
         
          for (int i = 0; i < filas; i++){
              for (int j = 0; j < columnas; j++){
                   if (matrizA[i][j] != matrizB[i][j]){
                       identidadSeCumple = false;
                   }
              }
          }
          
           if (identidadSeCumple){
               System.out.printf("La identidad algebraica se cumple\n");
           }else{
               System.out.printf("La identidad algebraica no se cumple\n");
           }
    }
}
