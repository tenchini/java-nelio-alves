package modulo10.aula107.exercicio.application;

import modulo10.aula107.exercicio.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be refistered? ");
        int qty = sc.nextInt();


        for(int i = 0; i < qty; i++){
            System.out.printf("%nEmployee #%d: %n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee employee = employees.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);

        if (employee == null){
            System.out.println("This id doest not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.printf("%nList of employees:%n");
        for (Employee emp : employees){
            System.out.println(emp);
        }


        sc.close();
    }
}
