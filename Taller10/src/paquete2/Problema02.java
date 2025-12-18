/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };
        int[] adultosPorFamilia = new int[edades.length];
        int totalMenores = 0;

        for (int a = 0; a < edades.length; a++) {
            int adultos = 0;
            for (int b = 0; b < edades[a].length; b++) {
                if (edades[a][b] < 18) {
                    totalMenores++;
                } else {
                    adultos++;
                }
            }
            adultosPorFamilia[a] = adultos;
        }
        System.out.printf("Total de menores de edad: %s", totalMenores);

        for (int a = 0; a < adultosPorFamilia.length; a++) {
            int numeroFamilia = a + 1;
            System.out.printf("Familia %d: %d adultos\n",
                     numeroFamilia,
                     adultosPorFamilia[a]);
        }
    }
}
