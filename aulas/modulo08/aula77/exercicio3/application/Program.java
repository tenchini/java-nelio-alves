package modulo08.aula77.exercicio3.application;

import java.util.Scanner;

import modulo08.aula77.exercicio3.entities.Student;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student student = new Student(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

    System.out.println();

    System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
    System.out.println(student.finalResult());

    sc.close();
  }
}
