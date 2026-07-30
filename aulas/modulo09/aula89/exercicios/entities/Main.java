package modulo09.aula89.exercicios.entities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(number, holder, initialDeposit);
        } else {
            account = new BankAccount(number, holder);
        }

        System.out.println();
        System.out.print("Account data:\n");
        System.out.println(account.toString());

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Updated account data:\n");
        System.out.println(account.toString());

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.print("Updated account data:\n");
        System.out.println(account.toString());

        sc.close();
    }
}
