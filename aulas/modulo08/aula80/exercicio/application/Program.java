package modulo08.aula80.exercicio.application;

import java.util.Scanner;

import modulo08.aula80.exercicio.entities.Dolar;
import modulo08.aula80.exercicio.util.CurrencyConverter;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Dolar dolar = new Dolar();

    System.out.print("What is the dollar price? ");
    dolar.price = sc.nextDouble();

    System.out.print("How many dollars will be bought? ");
    dolar.quantity = sc.nextDouble();

    System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.realAmount(dolar.price, dolar.quantity));

    sc.close();
  }
}
