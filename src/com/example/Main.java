package com.example;

public class Main {

    public static void main(String[] args) {
        int[] pouches = {100, 100, 100, 100, 90}; //initial data
        int answer = 0;
        float alterAnswer = 0;
        int incorrectPouches = 0;

        for (int i = 1; i <= pouches.length; i++) {
            if (pouches[i - 1] / i != 100 / i) {
                answer = i;
                incorrectPouches++;
                if (pouches[i - 1] != 90) {
                    alterAnswer = pouches[i - 1];
                }
            }
        }

        if (answer == 0) {
            System.out.println("Array is ideal :)");
        } else if (alterAnswer != 0) {
            System.out.println("Pouch with number " + answer + " has " + alterAnswer + "grams. Follow the terms of the task !");
        } else if (incorrectPouches > 1) {
            System.out.println("Only one puch have to be less then 100 grams");
        } else {
            System.out.println("Pouch with number " + answer + " has 90 grams");
        }
    }
}
