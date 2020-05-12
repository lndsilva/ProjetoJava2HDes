package PacoteJava;

public class Exemplo01 {

    //método principal
    public static void main(String args[]) {

        System.out.print("Bem vindo a nossa aula!!!");

        //Executar o método da outra classe no mesmo pacote.
        Exemplo02.mostraTexto();

    }
}
