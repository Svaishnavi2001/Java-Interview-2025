package com.concepts.oops.encapsulation_inheritance_composition;

class BankAccount {

    // private data members (cannot be accessed directly)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter + business logic (encapsulation)
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    // Setter + business logic (encapsulation)
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

}

public class Bank {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("AC12345", 5000);

        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getBalance());

    }
}

