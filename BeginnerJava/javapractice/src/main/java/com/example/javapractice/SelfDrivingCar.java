package com.example.javapractice;

public class SelfDrivingCar extends Car {
    public SelfDrivingCar(String colour, String mInterior){
        super(colour, mInterior);
    }

    @Override
    public void drive(){
        print("Recalculating way to go");
        super.drive();
    }




}
