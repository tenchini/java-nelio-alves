package modulo10.aula98exercicios.ex08;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtd = sc.nextInt();
        int[] vect = new int[qtd];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        double pairs = 0.0;
        int lenghtPairs = 0;
        for (int value: vect) {
            if ( value % 2 == 0){
                pairs += value;
                lenghtPairs++;
            }
        }

        double avgPairs = pairs / lenghtPairs;
        if (lenghtPairs == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f%n", avgPairs);
        }

        sc.close();
    }
}
