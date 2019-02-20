package com.example.javapractice;

public class CarSImulator {

    public static void main(String[] args) {
        print("Car Initial Commit ! " );
        print("Launching car simulator ...");
        Car myToyota = new Car();

        print("THe car colour is "+myToyota.colour);
        myToyota.colour = "blue";
        print("THe car colour is "+myToyota.colour);

        Car nelsonIdealCar = new Car("black", "Black");
        print(nelsonIdealCar.getInterior());

        SelfDrivingCar smartNCar = new SelfDrivingCar("Green", "Blue");
        smartNCar.drive();

    }

    public static void print(String stringToPrint){

        System.out.println(stringToPrint);
    }





}
