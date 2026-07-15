package modulo09.aula86;

import java.util.Scanner;

import modulo09.aula86.entities.Product;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data: ");

    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Price: ");
    double price = sc.nextDouble();
    System.out.println();

    Product product = new Product(name, price);

    product.setName("Computer");

    System.out.println("Updated name: " + product.getName());
    product.setPrice(1200.00);
    System.out.println("Updated price: " + product.getPrice());

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
