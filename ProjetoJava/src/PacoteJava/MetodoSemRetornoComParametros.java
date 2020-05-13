
package PacoteJava;

public class MetodoSemRetornoComParametros {
    
    public static void main(String[] args) {
        
        double num1,num2;
        
        num1 = 30.5;
        
        num2 = 20.5;
        
        somaValor(num1,num2);
        
    }
    
    public static void somaValor(double valor1, double valor2){

	double resposta = valor1+valor2;

	String resp = ("O resultado da soma é: "+resposta).toString();
        
        imprimeValores(resp);
    }
    
    public static void imprimeValores(String st){
        
        System.out.println(st);
    }
    
}
