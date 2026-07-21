package modulo09.aula89.exercicios.entities;

public class BankAccount {
    private int number;
    private String holder;
    private double balance;

    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public BankAccount(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("The withdrawal amount must be greater than zero.\n");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.\n");
            return false;
        }

        this.balance -= amount + 5;
        return true;
    }

    @Override
    public String toString(){
        return String.format("Account %d, Holder: %s, Balance: $ %.2f\n", getNumber(), getHolder(), getBalance());
    }
}
