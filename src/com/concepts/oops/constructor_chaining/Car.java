package com.concepts.oops.constructor_chaining;

public class Car {
    String brand;
    double price;
    int year;

    public Car(){
        // calling 1 argument constructor
        this("unknown");
        System.out.println("Default constructor ");

    }
    public Car(String brand){
        //calling 2 argument constructor
        this("Honda", 2022);

        System.out.println("1 argument constructor: "+brand);
    }

    public Car(String brand, int year){
        // calling 3 argument constructor
        this("Honda",45000,2002);
        System.out.println("2 argument constructor: "+ brand+","+price);
    }

    public Car(String brand ,double price, int year){
       this.brand=brand;
       this.price=price;
       this.year=year;

        System.out.println("3 argument constructor: "+ brand+","+price+","+year);

    }
}
