package com.concepts.exception_handling;

public class MoneyWithdrawal {
    public static void main(String[] args) {

        int balance=5000;
        int withdrawAmount=1500;

        try{
            if(balance < withdrawAmount){
                throw new ArithmeticException("Insufficient Balance");
            }
            balance=balance-withdrawAmount;
            System.out.println("Withdraw Successful! Remaining balance: "+ balance);

        }

        catch(ArithmeticException e){
            System.out.println("Transaction Failed" + e.getMessage());
        }

        finally {
            System.out.println("Thanks for using ATM");
        }

    }
}
