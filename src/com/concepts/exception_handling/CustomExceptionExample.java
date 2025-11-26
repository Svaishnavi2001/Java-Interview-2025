package com.concepts.exception_handling;


//Custom Exception class
class AgeNotValidException extends Exception{

    public AgeNotValidException(String msg){
        super(msg);
    }
}
public class CustomExceptionExample {

    static void validateAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be above 18 to register!");
        }
        System.out.println("Age validated Successfully!");
    }

    static void registerForVaccine(String name, int age) throws AgeNotValidException {
        System.out.println("Register user: " + name);
        validateAge(age); // it will throw an exception
        System.out.println("Registration completed!");
    }

    public static void main(String[] args) {

        try {
            registerForVaccine("Sneha", 17);
        }
        catch (AgeNotValidException e) {
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
