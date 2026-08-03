package modulo10.aula098.exercicios.ex07;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtd = sc.nextInt();
        double[] vect = new double[qtd];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (double value : vect) {
            if (value < avg) {
                System.out.println(value);
            }
        }

        sc.close();
    }
}
