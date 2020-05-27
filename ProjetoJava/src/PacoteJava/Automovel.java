package PacoteJava;

public class Automovel {

    //Atributos ou variáveis globais
    public String modelo;
    public String cor;
    public int velocidade = 0;

    //Criando os métodos ou ações
    public void buzinar() {
        System.out.println("Beeeepppp...");
    }

    public void acelerar() {
        velocidade++;
        //velocidade = velocidade + 1;
        System.out.println("Acelerou = "+velocidade);
    }

    public void reduzir() {
         velocidade--;
        //velocidade = velocidade - 1;
        System.out.println("Reduziu = "+velocidade);

    }

}
