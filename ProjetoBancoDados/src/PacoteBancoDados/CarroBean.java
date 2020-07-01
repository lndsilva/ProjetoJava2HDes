package PacoteBancoDados;

public class CarroBean {

    //Definindo as atributos/variáveis globais
    private String placa;
    private String cor;
    private String descricao;

    //Criar os construtores
    public CarroBean() {
    }

    public CarroBean(String placa, String cor, String descricao) {
        this.placa = placa;
        this.cor = cor;
        this.descricao = descricao;
    }
    
    //Definindo os getters e setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
