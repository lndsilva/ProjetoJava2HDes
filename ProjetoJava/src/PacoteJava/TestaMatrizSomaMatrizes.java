package PacoteJava;

import javax.swing.JOptionPane;

public class TestaMatrizSomaMatrizes {

    public static void main(String[] args) {
        int valores1[][] = new int[3][3];
        int valores2[][] = new int[3][3];
        int mresultado[][] = new int[3][3];

        String aux = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux = JOptionPane.showInputDialog(null,
                        "Insira os valores na matriz01");
                valores1[i][j] = Integer.parseInt(aux);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux = JOptionPane.showInputDialog(null,
                        "Insira os valores na matriz02");
                valores2[i][j] = Integer.parseInt(aux);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mresultado[i][j] = valores1[i][j] + valores2[i][j];

            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz resultado "+mresultado[i][j]);

            }
        }

    }
}
