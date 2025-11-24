package com.concepts.exception_handling;

public class Login {

    static void creds(String userName, String password) throws Exception{
        if (!userName.equals("Sneha") || !password.equals("1234")) {
            throw new Exception("Invalid Username or Password");

        }
        System.out.println("Successful login!!");
    }

    public static void main(String[] args) {
        try {
            creds("Sneha", "1111");
        } catch (Exception e) {
            System.out.println("Login Failed: " + e.getMessage());
        }
        finally {
            System.out.println("Login Attempt Completed.");
        }
    }
}
