package modulo10.aula98exercicios.ex02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qty = sc.nextInt();
        double[] number = new double[qty];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Digite um número: ");
            number[i] = sc.nextDouble();
        }

        double sum = 0.0;
        System.out.printf("VALORES = ");
        for (double num : number) {
            System.out.printf("%.1f ", num);
            sum += num;
        }
        double avg = sum / number.length;
        System.out.printf("\nSOMA = %.2f%n", sum);
        System.out.printf("MÉDIA = %.2f%n", avg);


        sc.close();
    }
}
