package modulo08.aula78a79.parte1.version2.application;

import java.util.Scanner;

import modulo08.aula78a79.parte1.version2.util.Calculator;

public class Program {

  public static final double PI = 3.14;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Calculator calculator = new Calculator();

    System.out.print("Enter radius: ");

    double radius = sc.nextDouble();

    double c = calculator.circumference(radius);

    double v = calculator.volume(radius);

    System.out.printf("Circumference: %.2f%n", c);
    System.out.printf("Volume: %.2f%n", v);
    System.out.printf("PI value: %.2f%n", calculator.PI);

    sc.close();
  }
}
