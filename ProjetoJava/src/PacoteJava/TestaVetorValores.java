package PacoteJava;

public class TestaVetorValores {

    public static void main(String[] args) {
        //instanciar um vetor

        int valores[] = new int[10];

        for (int i = 0; i < 10; i++) {

            valores[i] = 20;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor do vetor na posição "+i+" é: " + valores[1]);
        }

    }

}
