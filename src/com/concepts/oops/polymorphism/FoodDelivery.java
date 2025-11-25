package com.concepts.oops.polymorphism;

 class FoodDelivery {

    public void deliver() {
        System.out.println("Delivering food to the customer.");
    }

    // private mwthod
    private void deliverFoodItem() {
        System.out.println("Delivering foodItem to the customer.");
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

        // visibility
        public void deliverFoodItem() {
            System.out.println("Swiggy is delivering Pizza to the customer.");
        }

 }

 class Zomato extends FoodDelivery {

        @Override
        public void deliver() {
            System.out.println("Zomato is delivering food to the customer");
        }

        public void  deliverFoodItem() {
            System.out.println("Zomato is delivering burger to the customer");
        }

     }


 class Main {
        public static void main(String[] args) {

            Swiggy swiggy=new Swiggy();
            swiggy.deliver();
            swiggy.deliverFoodItem();

            Zomato zomato=new Zomato();
            zomato.deliver();
            zomato.deliverFoodItem();
        }
    }

