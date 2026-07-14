package modulo08.aula71;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the measures of triangle X:");
    double aX = sc.nextDouble();
    double bX = sc.nextDouble();
    double cX = sc.nextDouble();

    System.out.println("Enter the measures of triangle X:");
    double aY = sc.nextDouble();
    double bY = sc.nextDouble();
    double cY = sc.nextDouble();

    double p = (aX + bX + cX) / 2.0;

    double xArea = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));

    p = (aY + bY + cY) / 2.0;
    double yArea = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));

    System.out.printf("Triangle X area: %.4f%n", xArea);
    System.out.printf("Triangle Y area: %.4f%n", yArea);

    if (xArea > yArea) {
      System.out.println("Larger area: X");
    } else {
      System.out.println("Larger area: Y");
    }

    sc.close();
  }
}
