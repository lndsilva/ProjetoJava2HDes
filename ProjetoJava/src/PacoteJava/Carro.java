package PacoteJava;

public class Carro {

    //Modificador ou método de Acesso private
    private String modelo;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    //Criar os métodos getters e setters
    //Tecla de atalho para criação dos métodos get e set
    //alt+insert

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
   
   public String ligarCarro() {
        return "Ligado!!!";
    }

    public String desligarCarro() {
        return "Desligado!!!";
    }

    public String acelerarCarro() {
        return "Acelerando!!!";
    }

    public String reduzirCarro() {
        return "Reduzindo!!!";
    }

    public String pararCarro() {
        return "Parando!!!";
    }

}
