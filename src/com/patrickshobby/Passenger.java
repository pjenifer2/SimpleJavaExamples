package com.patrickshobby;

public class Passenger {
    int checkedBags;
    int freeBags;
    double perBagFee;

    //example of a constructor
    public Passenger(int freeBags){
        this(freeBags > 1 ? 25.0d : 50d);
        this.freeBags = freeBags;
    }

    //example of a constructor
    public Passenger(int freeBags, int checkedBags){
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    //example of a private constructor
    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    //example of a getter
    public double getPerBagFee(){
        return perBagFee;
    }

}
