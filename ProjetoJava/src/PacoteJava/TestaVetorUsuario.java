package PacoteJava;


import javax.swing.*;

public class TestaVetorUsuario {
    
    public static void main(String [] args) {
        
        int valores[] = new int[10];
        
        String aux = "";

        //Usuário que vai inserir valores no vetor
        for (int i = 0; i < 10; i++) {
            aux = JOptionPane.showInputDialog(null,"Insira valores para o vetor na posição "+i);
            valores[i] = Integer.parseInt(aux);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("O Valor do vetor na posição "+i+" é: " + valores[i]);
            
        }
        
    }
    
}
