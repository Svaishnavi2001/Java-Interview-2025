package com.concepts.oops.polymorphism;

 class FoodDelivery {

    public void deliver() {
        System.out.println("Delivering food to the customer.");
    }

    private String deliverFoodItem(String foodItem) {
        return "Delivering " + foodItem + " to the customer.";
    }

    public String  deliverFoodItemWithAddress(String foodItem, String address) {
        return "Delivering " + foodItem + " to "+ address;
    }

    public void deliverFoodItemWithAddressAndDeliveryPerson(String foodItem, String address, String deliveryPerson) {
        System.out.println(deliveryPerson + " is delivering " + foodItem + " to " + address + ".");
    }
}

class Swiggy extends FoodDelivery {

        @Override
        public void deliver() {
            System.out.println("Swiggy is delivering food to the customer.");
        }

        //Visibility
        public String deliverFoodItem(String foodItem) {
            return "Swiggy is delivering " + foodItem + " to the customer.";
        }

 }

 class Zomato extends FoodDelivery {

        public void deliver() {
            System.out.println("Zomato is delivering food to the customer");
        }

        public String  deliverFoodItem(String foodItem) {
            return "Zomato is delivering " + foodItem + " to the customer";
        }

     }


 class Main {
        public static void main(String[] args) {

            Swiggy swiggy=new Swiggy();
            swiggy.deliver();
            System.out.println(swiggy.deliverFoodItem("Pizza"));

            Zomato zomato=new Zomato();
            zomato.deliver();
            System.out.println(zomato.deliverFoodItem("Burger"));
        }
    }

