/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };
        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int[] diasAsistidos = new int[estudiantes.length];

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j]) {
                    diasAsistidos[i]++;
                }
            }
        }

        for (int i = 0; i < estudiantes.length; i++) {
            String nombre = estudiantes[i];
            int dias = diasAsistidos[i];
            boolean asistenciaCompleta = (dias == 5);
            String mensaje = String.format("Estudiante: %s, Días asistidos: %d"
                    + ", Asistencia completa: %b\n",
                     nombre,
                     dias,
                     asistenciaCompleta);
            System.out.printf("%s", mensaje);
        }

    }
}
