package modulo09.aula83;

import java.util.Scanner;

import modulo09.aula83.entities.Product;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data: ");

    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Price: ");
    double price = sc.nextDouble();
    System.out.print("Quantity in stock: ");
    int quantity = sc.nextInt();
    System.out.println();

    Product product = new Product(name, price, quantity);

    System.out.println("Product data: " + product.toString());

    System.out.print("Enter the number of products to be added in stock: ");
    product.addProducts(sc.nextInt());
    System.out.println();

    System.out.println("Updated data: " + product.toString());

    System.out.print("Enter the number of products to be removed from stock: ");
    product.removeProducts(sc.nextInt());
    System.out.println();

    System.out.print("Updated data: " + product.toString());

    sc.close();
  }
}
