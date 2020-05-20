package PacoteJava;

import javax.swing.*;

public class TestaMatrizSomatoria {

    public static void main(String[] args) {
        int valores[][] = new int[3][3];
        int soma = 0;
        String aux = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux = JOptionPane.showInputDialog(null,
                        "Insira os valores");
                valores[i][j] = Integer.parseInt(aux);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma = soma + valores[i][j];

            }
        }

        System.out.println("A somatória :" + soma);

    }

}
