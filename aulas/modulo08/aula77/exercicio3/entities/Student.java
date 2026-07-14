package modulo08.aula77.exercicio3.entities;

public class Student {
  public String name;
  public double firstGrade;
  public double secondGrade;
  public double thirdGrade;

  public Student(String name, double firstGrade, double secondGrade, double thirdGrade) {
    this.name = name;
    this.firstGrade = firstGrade;
    this.secondGrade = secondGrade;
    this.thirdGrade = thirdGrade;
  }

  public double finalGrade() {
    return firstGrade + secondGrade + thirdGrade;
  }

  public boolean isApproved() {
    if (finalGrade() > 60.00) {
      return true;
    }
    return false;
  }

  public String finalResult() {
    if (!isApproved()) {
      return String.format("FAILED\nMISSING %.2f POINTS", 60.00 - finalGrade());
    }
    return "PASS";
  }

}
