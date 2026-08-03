package modulo10.aula101;

import modulo10.aula101.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int qty = sc.nextInt();


        for (int i = 1; i <= qty; i++) {
            System.out.printf("%nRent #%d %n", i);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.printf("%d: %s", i, rooms[i]);
            }
        }

        sc.close();
    }
}
