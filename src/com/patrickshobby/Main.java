package com.patrickshobby;



public class Main {

    public static void main(String[] args) {

        //FizzBizz();
        DetermineNumbers();

        String title = "Star Wars: Empire Strikes Back!";
        String lowerCaseTitle = title.toLowerCase();
        CountVowels movie = new CountVowels();
        movie.setText(lowerCaseTitle);
        int result = movie.getCountVowels();
        System.out.println("The movie title : " + title + " has " + result + " vowels in it!");



        Flight nycToLv = new Flight(123, 100);
        System.out.println(nycToLv.getPassengerCount());
        nycToLv.add1Passenger();
        System.out.println(nycToLv.getPassengerCount());
        nycToLv.add1Passenger();
        System.out.println(nycToLv.getPassengerCount());
        


        Passenger luke = new Passenger(3,3);
        System.out.println("The per bag fee is: " + luke.getPerBagFee());

    }

    private static void FizzBizz() {
        String[] FizzBizz = new String[101];

        for (int i = 0; i < 101; i++){
            if ( i == 0){
                FizzBizz[i] = String.valueOf(i);
            } else if ( i % 3 == 0 && i % 5 == 0){
                FizzBizz[i] = "FizzBizz";
            } else if (i % 3 == 0) {
                FizzBizz[i] = "Fizz";
            } else if (i % 5 == 0) {
                FizzBizz[i] = "Bizz";
            } else {
                FizzBizz[i] = String.valueOf(i);
            }
        }
        for (String result : FizzBizz) {
            if (!result.equals("0")) {
                System.out.println(result);
            }
        }
    }






    private static void DetermineNumbers() {
        int[] numbers = {1,3,5,7,9};
        int targetNumber = 12;

        int result = 0;

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                result = numbers[i] + numbers[j];
                if(result == targetNumber){
                    System.out.println("The two numbers that add up to " + targetNumber + " are " + numbers[i] + " and " + numbers[j]);
                    j = numbers.length;
                }
                if(result == targetNumber){
                    i = numbers.length;
                }
            }
        }

    }



}
