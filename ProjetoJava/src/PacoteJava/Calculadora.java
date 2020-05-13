package PacoteJava;

import javax.swing.*;

public class Calculadora {

    public static void main(String[] args) {
        double num1, num2, resp = 0.0;
        String aux = "", op = "";

        try {
            aux = JOptionPane.showInputDialog(null, "Insira o primeiro número: ", "Calculadora", -1);
            aux = aux.replace(',', '.');
            num1 = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Insira o segundo número", "Calculadora", -1);
            aux = aux.replace(',', '.');
            num2 = Double.parseDouble(aux);

            //Definir qual será a operação que deverá ser realizada.
            aux = JOptionPane.showInputDialog(null,
                    "Escolha a operação desejada: \n 1-Soma\n 2-Subtração\n 3-Multiplicação\n 4-Divisão \n",
                    "Calculadora", -1);
            aux = aux.replace(',', '.');
            int escolha = Integer.parseInt(aux);

            switch (escolha) {
                case 1:
                    //chamando o método de outra classe
                    //Nome da classe ponto nome do método
                    resp = Operacoes.somaValor(num1, num2);
                    op = "soma";
                    break;
                case 2:
                    resp = Operacoes.subtraiValor(num1, num2);
                    op = "subtração";
                    break;
                case 3:
                    resp = Operacoes.multiplicaValor(num1, num2);
                    op = "multiplicação";
                    break;
                case 4:
                    if (num2 == 0) {
                        op = "Impossível dividir por 0";
                    } else {
                        resp = Operacoes.divideValor(num1, num2);
                        op = "divisão";
                    }
                    break;
            }
            JOptionPane.showMessageDialog(null, "O resultado da " + op + " é " + resp);
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Favor inserir somente números",
                    "Calculadora", JOptionPane.ERROR_MESSAGE);

        }
    }

}
