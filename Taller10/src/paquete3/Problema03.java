/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {

        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };
        int[] funcional = new int[sensores.length];
        int[] noFuncional = new int[sensores.length];
        String mensaje = "";

        for (int fila = 0; fila < sensores.length; fila++) {
            int funcional2 = 0;
            int noFuncional2 = 0;
            for (int columna = 0; columna < sensores[fila].length; columna++) {
                if (sensores[fila][columna] == true) {
                    funcional2 = funcional2 + 1;
                } else {
                    noFuncional2 = noFuncional2 + 1;
                }
            }
            funcional[fila] = funcional2;
            noFuncional[fila] = noFuncional2;
        }
        int contador = 1;
        for (int i = 0; i < 4; i++) {
            if (funcional[i] == 6) {
                mensaje = mensaje + String.format("Zona %d:  sin fallos\n"
                        , contador);
            } else {
                mensaje = mensaje + String.format("Zona %d con: %d fallos\n",
                        contador,
                        noFuncional[i]);
            }
            contador++;
        }
        System.out.printf("%s", mensaje);

    }
}
