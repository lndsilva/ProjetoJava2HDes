package PacoteJava;

import javax.swing.*;

public class Escolha {
    
    public static void main(String[] args) {
        String aux="", st="";
        int escolha;
      
        
        aux= JOptionPane.showInputDialog(null,"Escolha uma opção: \n 1-Banana \n 2-Laranja \n 3-Maça",
                "Sistema de Produtos",JOptionPane.INFORMATION_MESSAGE);
        escolha = Integer.parseInt(aux);
   
        //digito o comando e apertar a tecla tab 2 vezes
        switch (escolha) {
            case 1: st = "Você escolheu Banana";
            break;
            case 2: st = "Você escolheu Laranja";
            break;
            case 3: st = "Você escolheu Maça";
            break;
            default: st="Você não escolheu nenhuma opção";
            break;
        }
        JOptionPane.showMessageDialog(null,st);
             
        
    }
    
}
