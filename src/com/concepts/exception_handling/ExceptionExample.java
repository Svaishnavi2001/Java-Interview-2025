package com.concepts.exception_handling;

public class ExceptionExample {

    static void validateAge( int age) throws Exception{
        if(age<18){
            throw new Exception("Age must be 18 or above to register!");
        }
        System.out.println("Age validated successfully!");

    }
    static void registerForVaccine(String name, int age) throws Exception{
        System.out.println("Registering user: "+ name);
        validateAge(age);
        System.out.println("Registration completed!");

    }

    public static void main(String[] args) {

        try{
            registerForVaccine("Vaishnavi", 15);
        }
        catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        finally {
            System.out.println("Program continues after exception handling...");
        }
    }
}
