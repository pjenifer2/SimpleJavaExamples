package com.patrickshobby;

public class Flight {
    private int passengers;
    private int seats = 150;
    private int flightNumber;
    private char flightClass;
    private boolean[] isSeatAvailable = new boolean[seats];

    //initializer
    {
        for (int i = 0; i < seats; i++){
            isSeatAvailable[i] = true;
        }
    }

    public Flight(int flightNumber, int passengers) {
        this.flightNumber = flightNumber;
        this.passengers = passengers;
    }

    public Flight(char flightClass){
        this.flightClass = flightClass;
    }


    void add1Passenger() {
        if (passengers < seats){
            passengers++;
        } else {
            handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too Many!");
    }

    public int getPassengerCount() {
        return passengers;
    }

}
