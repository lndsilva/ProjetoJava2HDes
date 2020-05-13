
package PacoteJava;

public class MetodoSemRetorno {
    
    public static void main(String[] args) {
        //chamada do método
        somaValor();
    }
    
   public static void somaValor(){
	
	double resposta=0.0, valor1, valor2;

	valor1=20.5;
	valor2=10.5;

	resposta = valor1+valor2;

	System.out.println("O resultado da soma é: "+resposta);
   }
}
