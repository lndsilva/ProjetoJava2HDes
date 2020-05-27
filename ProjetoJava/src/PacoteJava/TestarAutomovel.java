package PacoteJava;

public class TestarAutomovel {

    public static void main(String[] args) {

        //Atributo ou variável que possa 
        //representar o objeto deste lado
        //Tipo da variável e o nome da variável
        //Automovel meuAutomovel;
        //a variável está recebendo uma instância do
        //objeto Automovel.
        //meuAutomovel = new Automovel();
        Automovel meuAutomovel = new Automovel();

        //Para utilizar o que o objeto tem...
        
        //Estou utilizando os atributos ou variáveis
        meuAutomovel.cor = "Amarelo";
        meuAutomovel.modelo = "Fusca";
        meuAutomovel.velocidade = 20;
        
        //Estou utilizando os métodos ou ações
        meuAutomovel.buzinar();
        meuAutomovel.acelerar();
        meuAutomovel.reduzir();
        
        

    }

}
