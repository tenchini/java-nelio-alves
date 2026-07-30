package modulo10.aula98exercicios.ex05;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtd = sc.nextInt();
        float[] vect = new float[qtd];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        float highestValue = vect[0];
        int index = 0;

        for (int i = 1; i < vect.length; i++) {
            if (vect[i] > highestValue) {
                highestValue = vect[i];
                index = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", highestValue);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d%n", index);
        sc.close();
    }
}
