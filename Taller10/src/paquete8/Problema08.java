/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author ASUS
 */
public class Problema08 {

    public static void main(String[] args) {

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        int filas = dato1.length;
        int columnas = dato1[0].length;
        double[][] resultado = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (dato1[i][j] < dato2[i][j]) {
                    resultado[i][j] = dato1[i][j];
                } else {
                    resultado[i][j] = dato2[i][j];
                }
            }
        }
        System.out.println("Arreglo Resultante:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
