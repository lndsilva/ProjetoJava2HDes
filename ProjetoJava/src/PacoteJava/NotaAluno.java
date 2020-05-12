package PacoteJava;

import javax.swing.*;

public class NotaAluno {
//Calcular a média de uma aluno
//nota01, nota02, trabalho, média    

    public static void main(String[] args) {

        double nota01, nota02, trabalho, media = 0.0;
        String aux = "";

        try {
            //inserindo valores nas variáveis
            aux = JOptionPane.showInputDialog(null, "Insira a nota01", "Sistema de notas", 1);
            //trocar o ponto '.' pela virgula ','
            aux = aux.replace(',', '.');
            nota01 = Double.parseDouble(aux);
            System.out.println(nota01);

            aux = JOptionPane.showInputDialog(null, "Insira a nota02", "Sistema de notas", -1);
            aux = aux.replace(',', '.');
            nota02 = Double.parseDouble(aux);
            System.out.println(nota02);

            aux = JOptionPane.showInputDialog(null, "Insira a nota do Trabalho", "Sistema de notas", 0);
            aux = aux.replace(',', '.');
            trabalho = Double.parseDouble(aux);
            System.out.println(trabalho);

            //realizando o calculo
            media = (nota01 + nota02 + trabalho) / 3;

            //mostrar para o usuário
            JOptionPane.showMessageDialog(null, "A média do aluno: " + media, "Sistema de notas", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {

            //JOptionPane.showMessageDialog(null, "Qual foi o tipo de erro " + ex);
            // System.out.println("Qual foi o tipo de erro:  " + ex);
            JOptionPane.showMessageDialog(null, "Favor inserir somente números.", "Sistema de notas", -1);
            //finalizar o sistema
            System.exit(0);

            //Podemos retorna para outro método
            //abrirJanelaEntrada();
        }
    }

}
