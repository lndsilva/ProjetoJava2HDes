package PacoteJava;

public class TestarCarro {

    public static void main(String[] args) {

        //Instânciar o objeto Carro e Pessoa
        Carro meuCarro = new Carro();
        
        Pessoa ps = new Pessoa();
        
        
        
        //Acessar os componentes do objeto Carro.
        meuCarro.acelerarCarro();
        //Escrever na variável da classe Carro
        meuCarro.setModelo("Brasilia");
        ps.setNome("Antonio da Cunha");

        System.out.println("O modelo do carro é= " + meuCarro.getModelo() + " que é utilizado pelo " + ps.getNome());

    

    }

}
