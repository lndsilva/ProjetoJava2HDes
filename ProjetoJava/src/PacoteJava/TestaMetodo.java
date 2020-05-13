
package PacoteJava;

public class TestaMetodo {
    
    //Método principal
    //String [] -> do tipo vetor
    public static void main(String[] args) {
        
        double resposta=0.0;
        //chamada do método ou executar o método
        resposta = somaValor(20.5,30.5);
        
        System.out.println("O resultado da soma é: "+resposta);
        
    }
    
        //A assinatura do método
    
    public static double somaValor(double valor1, double valor2){
        
        return (valor1+valor2);
    }
    
}
