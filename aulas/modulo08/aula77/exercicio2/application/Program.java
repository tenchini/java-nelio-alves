package modulo08.aula77.exercicio2.application;

import java.util.Scanner;

import modulo08.aula77.exercicio2.entities.Employee;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employee employee = new Employee();

    System.out.print("Name: ");
    employee.name = sc.nextLine();

    System.out.print("Gross salary: ");
    employee.grossSalary = sc.nextDouble();

    System.out.print("Tax: ");
    employee.tax = sc.nextDouble();
    System.out.println();

    System.out.println("Employee: " + employee.toString());

    System.out.print("Which percentage to increase salary: ");
    employee.increaseSalary(sc.nextDouble());
    System.out.println();

    System.out.println("Updated data: " + employee.toString());

    sc.close();
  }
}
