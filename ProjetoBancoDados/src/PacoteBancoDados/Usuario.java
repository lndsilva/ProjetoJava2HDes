package PacoteBancoDados;

//lógica é representar o usuário
public class Usuario {

    //Variáveis globais
    private int codUsu;
    private String nomeUsu;
    private String senhaUsu;

    //métodos construtores
    //alt+insert
    public Usuario() {
    }

    public Usuario(int codUsu, String nomeUsu, String senhaUsu) {
        this.codUsu = codUsu;
        this.nomeUsu = nomeUsu;
        this.senhaUsu = senhaUsu;
    }

    public Usuario(String nomeUsu, String senhaUsu) {
        this.nomeUsu = nomeUsu;
        this.senhaUsu = senhaUsu;
    }
    //Criando os métodos getters e setters

    public int getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(int codUsu) {
        this.codUsu = codUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

}
