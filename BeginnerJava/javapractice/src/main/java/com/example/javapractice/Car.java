package com.example.javapractice;



public class Car {

    public String colour = "Black";
    protected int myNumberOfSeats = 4;

    public String getInterior() {
        return mInterior;
    }

    private String mInterior;

    public Car() {

    }
    public Car(String colour, String mInterior) {

        this.mInterior = mInterior;
        this.colour = colour;

    }

    public int getMyNumberOfSeats() {
        return myNumberOfSeats;
    }

    public void setMyNumberOfSeats(int myNumberOfSeats) {
        this.myNumberOfSeats = myNumberOfSeats;
    }

    public void drive(){
        System.out.println("Run Rung!");
    }


    protected static void print(String stringToPrint){

        System.out.println(stringToPrint);
    }




}
