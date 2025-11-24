package com.concepts.exception_handling;


public class BankBalance {

    static void checkBalance(int balance) throws ArithmeticException {

        if (balance < 1000) {
            throw new ArithmeticException("Balance too low! Maintain minimum ₹1000. ");
        }

        System.out.println("Balance is sufficient: ₹" + balance);
    }

    public static void main(String[] args) {


        try {
            checkBalance(500);

        } catch (ArithmeticException e) {
            System.out.println("Warning: " + e.getMessage());
        }
        finally {
            System.out.println("Successful Bank balance checking");
        }
    }
}
