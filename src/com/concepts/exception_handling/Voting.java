package com.concepts.exception_handling;

public class Voting {

     void checkAge(int age) {

         try {
             if (age < 18) {
                 throw new ArithmeticException("Not eligible for voting");
             }
             System.out.println("Eligible for voting");

         }
         catch(ArithmeticException e){
             System.out.println(e.getMessage());
         }

         finally {
             System.out.println("Eligibility has to be above 18 years");
         }

     }

    public static void main(String[] args) {

        Voting votingAge = new Voting();

            votingAge.checkAge(15);


    }
}
