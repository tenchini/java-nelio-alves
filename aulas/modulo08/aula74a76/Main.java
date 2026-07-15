package modulo08.aula74a76;

import java.util.Scanner;

import modulo08.aula74a76.entities.Product;

public class Main {
  public static void main(String[] args) {
    Product product = new Product();

    System.out.println("Enter product data: ");

    Scanner sc = new Scanner(System.in);
    System.out.print("Name: ");
    product.name = sc.nextLine();
    System.out.print("Price: ");
    product.price = sc.nextDouble();
    System.out.print("Quantity in stock: ");
    product.quantity = sc.nextInt();
    System.out.println();

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
