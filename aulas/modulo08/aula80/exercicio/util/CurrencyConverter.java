package modulo08.aula80.exercicio.util;

public class CurrencyConverter {

  public static final double IOF = 1.06;

  public static double realAmount(double dolarPrice, double dolarQuantity) {
    return dolarPrice * dolarQuantity * IOF;
  }
}
