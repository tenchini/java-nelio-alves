package modulo10.aula098.exercicios.ex10;

import modulo10.aula098.exercicios.ex10.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int qtd  = sc.nextInt();
        Student[] students = new Student[qtd];

        for (int i = 0; i < students.length; i++) {
            sc.nextLine();
            System.out.printf("Digite o nome, primeira e segunda nota do %do aluno: %n", i + 1);
            students[i] = new Student(sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }

        for (Student student : students) {
            student.setAvg(student.getFirstSemester(), student.getSecondSemester());
        }

        System.out.println("Alunos aprovados: ");
        for (Student student : students) {
            if (student.getAvg() >= 6) {
                System.out.println(student.getName());
            }
        }
        
        sc.close();
    }
}
