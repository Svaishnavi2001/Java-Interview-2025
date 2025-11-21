package java.concepts.oops.polymorphism;

class Casio implements Calculator {

    @Override
    public int addition(int a, int b) {
        return 0;
    }

    @Override
    public int addition(int a, int b, int c) {
        return 0;
    }

    @Override
    public int addition(float x, float y) {
        return 0;
    }

    @Override
    public int substraction(int a, int b) {
        return 0;
    }

    @Override
    public int multiplication(int a, int b) {
        return 0;
    }

    @Override
    public int division(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Casio();
        calculator.addition(1.8f,2.8f);
        calculator.addition(2,3,4);

    }
}