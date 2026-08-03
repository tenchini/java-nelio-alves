package modulo10.aula098.exercicios.ex06;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int qtd = sc.nextInt();
        int[] vectA = new int[qtd];
        int[] vectB = new int[qtd];

        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for(int j = 0; j < vectB.length; j++){
            vectB[j] = sc.nextInt();
        }

        int[] vectSum = new int[qtd];

        for(int i = 0; i < vectA.length; i++){
            vectSum[i] = vectA[i] + vectB[i];
        }

        System.out.println("VETOR RESULTANTE: ");

        for (int i : vectSum) {
            System.out.println(i);
        }

        sc.close();
    }
}
