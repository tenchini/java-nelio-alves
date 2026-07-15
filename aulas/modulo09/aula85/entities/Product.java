package modulo09.aula85.entities;

public class Product {
  public String name;
  public double price;
  public int quantity;

  // construtor padrão
  public Product() {
  }

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // sobrecarga
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double totalValueInStock() {
    return this.price * this.quantity;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  public String toString() {
    return String.format("%s, $ %.2f, %d units, Total: $ %.2f%n", this.name, this.price, this.quantity,
        totalValueInStock());
  }
}
