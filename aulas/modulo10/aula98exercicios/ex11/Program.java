package modulo10.aula98exercicios.ex11;

import modulo10.aula98exercicios.ex11.entities.Person;

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
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double height = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i + 1);
            String gender = sc.next();
            people[i] = new Person(height, gender);
        }

        double lowerHeight = people[0].getHeight();
        double upperHeight = people[0].getHeight();
        double sum = 0.0;
        int qtyF = 0;
        int qtyM = 0;
        for (Person person : people) {
            if (person.getHeight() < lowerHeight) {
                lowerHeight = person.getHeight();
            }
            if (person.getHeight() > upperHeight) {
                upperHeight = person.getHeight();
            }
            if (person.getGender().equals("F")) {
                sum += person.getHeight();
                qtyF++;
            }
            if (person.getGender().equals("M")) {
                qtyM++;
            }
        }
        double avg = sum / qtyF;

        System.out.printf("Menor altura = %.2f%n", lowerHeight);
        System.out.printf("Maior altura = %.2f%n", upperHeight);
        System.out.printf("Média de altura das mulheres = %.2f%n", avg);
        System.out.printf("Número de homens = %d", qtyM);


        sc.close();
    }
}
