package PacoteJava;

import javax.swing.*;

public class TestaMatrizSomatoria {

    public static void main(String[] args) {
        
        int coluna=0, linha=0;     
                
        int soma = 0;
        String aux = "";

        aux = JOptionPane.showInputDialog(null,"Insira o valor coluna da matriz");
        coluna = Integer.parseInt(aux);
        
        aux = JOptionPane.showInputDialog(null, "Insira o valor da linha da matriz");
        linha = Integer.parseInt(aux);
        
        //criar a matriz de linha e coluna
        int valores[][] = new int[linha][coluna];
        
        
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                aux = JOptionPane.showInputDialog(null,
                        "Insira os valores");
                valores[i][j] = Integer.parseInt(aux);
            }
        }
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                soma = soma + valores[i][j];

            }
        }

        System.out.println("A somatória :" + soma);

    }

}
