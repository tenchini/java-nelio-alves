package modulo10.aula98exercicios.ex10.entities;

public class Student {
    private String name;
    private double firstSemester;
    private double secondSemester;
    private double avg;

    public Student(String name, double firstSemester, double secondSemester) {
        this.name = name;
        this.firstSemester = firstSemester;
        this.secondSemester = secondSemester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstSemester() {
        return firstSemester;
    }

    public void setFirstSemester(double firstSemester) {
        this.firstSemester = firstSemester;
    }

    public double getSecondSemester() {
        return secondSemester;
    }

    public void setSecondSemester(double secondSemester) {
        this.secondSemester = secondSemester;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double firstSemester, double secondSemester) {
        this.avg = (firstSemester + secondSemester) / 2;
    }
}
