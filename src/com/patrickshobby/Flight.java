package com.patrickshobby;

public class Flight {
    int passengers;
    int seats;

    //example of constructor
    Flight() {
        seats = 150;
        passengers = 0;
    }

    void add1Passenger() {
        if (passengers < seats){
            passengers++;
        }
    }
}
