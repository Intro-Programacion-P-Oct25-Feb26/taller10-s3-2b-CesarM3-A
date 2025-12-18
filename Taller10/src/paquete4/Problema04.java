/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int filas = 3, columnas = 2;
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        boolean mayoroIgual = true;
        boolean mayor = false;

        System.out.printf("Ingrese los valores para las matrices A y B (%dx%d):\n", filas, columnas);
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.printf("A[%d][%d]: ", f, c);
                matrizA[f][c] = entrada.nextInt();
                System.out.printf("B[%d][%d]: ", f, c);
                matrizB[f][c] = entrada.nextInt();
            }
        }
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.printf("\nMatriz A:\n%d\t", matrizA[f][c]);
            }
        }

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.printf("\nMatriz B:\n%d\t", matrizB[f][c]);
            }
        }
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (matrizA[f][c] < matrizB[f][c]) {
                    mayoroIgual = false;
                } else 
                if (matrizA[f][c] > matrizB[f][c]){
                    mayor = true;
                }
            }
        }
        if (mayoroIgual && mayor) {
            System.out.println("\n\nLa matriz A es mayor que la matriz B\n");
        }else{
            System.out.println("\n\nLa matriz A no es mayor que la matriz B\n");
        }
    }
}
