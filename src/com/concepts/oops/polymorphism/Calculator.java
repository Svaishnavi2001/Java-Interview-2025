package com.concepts.oops.polymorphism;

interface  Calculator {

    int addition(int a, int b);

    int addition(int a, int b, int c);

    int addition(float a, float b);

    int subtraction(int a, int b);

    int multiplication(float a, float b);

    int division(long a, long b);
}

    class Casio implements Calculator{

        @Override
        public int addition(int a, int b) {
            return a+b;
        }

        @Override
        public int addition(int a, int b, int c) {
            return a+b+c;
        }

        @Override
        public int addition(float a, float b) {
            return (int)(a+b);
        }

        @Override
        public int subtraction(int a, int b) {
            return a-b;
        }

        @Override
        public int multiplication(float a, float b) {
            return (int)(a*b);
        }

        @Override
        public int division(long a, long b) {
            return (int)(a/b);
        }
    }

    class Demo{

        public static void main(String[] args) {

            Calculator calculator = new Casio();

            System.out.println(calculator.addition(1.8f,2.8f));
            System.out.println(calculator.addition(2,3));
            System.out.println(calculator.addition(2,3,4));
            System.out.println(calculator.subtraction(5,3));
            System.out.println(calculator.multiplication(8.5f,2.3f));
            System.out.println(calculator.division(200,50));

        }
    }



