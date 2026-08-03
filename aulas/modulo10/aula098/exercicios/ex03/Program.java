package modulo10.aula098.exercicios.ex03;

import modulo10.aula098.exercicios.ex03.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qty = sc.nextInt();
        Person[] people = new Person[qty];

        for (int i = 0; i < people.length; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            people[i] = new Person(nome, idade, altura);
        }
        double sum = 0.0;
        double avg = 0;
        for (Person person : people) {
            sum += person.getHeight();
            if (person.getAge() < 16) {
                avg++;
            }
        }

        double under16 = (avg / people.length) * 100;
        double avgHeight = sum / people.length;

        System.out.printf("%nAltura média: %.2f%n", avgHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%  %n", under16);
        for (Person person : people) {
            if (person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }

        sc.close();
    }
}
