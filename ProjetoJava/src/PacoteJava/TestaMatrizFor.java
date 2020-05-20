package PacoteJava;

import javax.swing.*;

public class TestaMatrizFor {

    public static void main(String[] args) {
        //instanciar a matriz de 3x3
        int valores[][] = new int[3][3];

        String aux = "";

        //Inserindo valores na matriz 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux = JOptionPane.showInputDialog(null, "Insira valores \n na linha: " + i + " e na coluna: " + j);
                valores[i][j] = Integer.parseInt(aux);
            }
        }
        //Imprimindo valores na matriz 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Imprimindo os valores da matriz \n Linha: " + i + " e na Coluna: " + j + " =" + valores[i][j]);
            }
        }

    }

}
