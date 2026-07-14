package modulo08.aula73;

import java.util.Scanner;

import modulo08.aula73.entities.Triangle;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    System.out.println("Enter the measures of triangle X:");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    System.out.println("Enter the measures of triangle X:");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double xArea = x.area();

    double yArea = y.area();

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
