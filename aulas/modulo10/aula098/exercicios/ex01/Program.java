package modulo10.aula098.exercicios.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qty = sc.nextInt();
        int[] numbers = new int[qty];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int num : numbers) {
            if (num < 0) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
