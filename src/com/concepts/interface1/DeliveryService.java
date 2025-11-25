package com.concepts.interface1;

public interface DeliveryService {

    // abstract method
    void deliverOrder(int orderId, String address);

    // default method
    default void trackOrder(int orderId){
        System.out.println("Tracking "+ orderId +" using tracking system");
    }

    //private method
    private void returnOrderPickup(){
        System.out.println("Order will be picked-up very soon!!");
    }

    //static method
    static void servicePolicy(){
        System.out.println("Delivery partners must follow traffic rules and deliver on time.");
    }

}
class BikeDelivery implements DeliveryService {
    @Override  // abstract method
    public void deliverOrder(int orderId, String address){
        System.out.println("Delivering "+ orderId +" to this "+address);
    }

    @Override  // default method
    public void trackOrder(int orderId){
        System.out.println("Tracking order " + orderId + " using premium Bike GPS system.");
    }

    // visibility
    public void returnOrderPickup(){    // private method
        System.out.println("Order will be picked-up very soon!! by Bike");
    }

}

class CarDelivery implements DeliveryService {

    @Override
    public void deliverOrder(int orderId, String address) {
        System.out.println("Delivering " + orderId + " to this " + address);
    }

    @Override
    public void trackOrder(int orderId) {
        System.out.println("Tracking order " + orderId + " using premium Car GPS system.");
    }

    public void returnOrderPickup(){
        System.out.println("Order will be picked-up very soon!! by Car");
    }
}
class Service{
    public static void main(String[] args) {
        DeliveryService bike = new BikeDelivery();
        bike.deliverOrder(123456777, "MG Road, Bangalore");
        bike.trackOrder(123456777);
        //bike.returnOrderPickup();


        DeliveryService car = new CarDelivery();
        car.deliverOrder(2349765,"Koramangala, Bangalore");
        car.trackOrder(2349765);
       // car.returnOrderPickup();


        DeliveryService.servicePolicy();

    }
}

