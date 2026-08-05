package modulo10.aula111.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.printf("Position %d,%d: %n", i, j);
                    if (j -1 >= 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i - 1 >= 0){
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (j + 1 < matriz[i].length) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i + 1 < matriz.length) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
