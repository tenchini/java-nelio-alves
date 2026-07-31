package modulo10.aula98exercicios.ex09;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int qtd = sc.nextInt();
        String[] peopleName = new String[qtd];
        int[] peopleAge = new int[qtd];

        for (int i = 0; i < peopleName.length; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            peopleName[i] = sc.next();
            System.out.print("Idade: ");
            peopleAge[i] = sc.nextInt();
        }

        int oldestAge = peopleAge[0];
        int oldestIndex = 0;
        for (int i = 0; i < peopleAge.length; i++) {
            if (peopleAge[i] > oldestAge) {
                oldestAge = peopleAge[i];
                oldestIndex = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s%n", peopleName[oldestIndex]);

        sc.close();
    }
}
