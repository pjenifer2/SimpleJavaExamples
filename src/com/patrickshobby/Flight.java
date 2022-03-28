package com.patrickshobby;

public class Flight {
    int passengers;
    int seats;

    //example of constructor
    Flight() {
        seats = 1;
        passengers = 0;
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
}
