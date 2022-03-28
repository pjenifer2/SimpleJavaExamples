package com.patrickshobby;

public class CountVowels {
        String sample;

        int CountVowels(){
            int countOfVowels = 0;
            for (int i = 0; i < sample.length(); i++) {
                char letter = sample.charAt(i);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    countOfVowels++;
                }
            }
            return countOfVowels;

        }
}
