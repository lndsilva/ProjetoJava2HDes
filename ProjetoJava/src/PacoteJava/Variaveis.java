package PacoteJava;

public class Variaveis {
    //Variáveis globais

    static int valor1;
    static double num1, num2;
    static String nome = "qualquer valor";
    
    //variáveis constantes e global
    
    static final double pi = 3.145619;

    public static void main(String[] args) {
        //chamar o método para ser executado Obs.: (da mesma classe)
        System.out.println("O que você irá imprimir aqui: " + nome);

        somaValor();
        subtrairValor();

    }

    public static void subtrairValor() {
        double resp = 0.0;
        nome = "subtração";

        num1 = 30.50;
        num2 = 20.50;

        resp = num1 - num2;

        System.out.println("A " + nome + " de num1 e num = " + resp);

    }

    public static void somaValor() {
        //variável interna ao método
        double resp = 0.0;
        nome = "soma";

        //inicializar as variáveis dentro do método
        num1 = 20.50;
        num2 = 30.50;

        resp = num1 + num2 + pi;

        System.out.println("A " + nome + " de num1 e num2 e pi = " + resp);

    }

}
