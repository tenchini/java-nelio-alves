package modulo10.aula098.exercicios.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtd = sc.nextInt();
        int[] vect = new int[qtd];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");

        int sum = 0;
        for (int num : vect) {
            if (num % 2 == 0) {
                System.out.printf("%d ", num);
                sum++;
            }
        }

        System.out.printf("\nQUANTIDADE DE PARES = %d", sum);
        sc.close();
    }
}
