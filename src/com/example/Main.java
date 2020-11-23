package com.example;

public class Main {

    public static void main(String[] args) {
        int[] pouches = {90, 100, 100, 100, 100}; //initial data
        int answer = 0;
        float alterAnswer = 0;

        for (int i = 1; i <= pouches.length; i++) {
            if (pouches[i - 1] / i != 100 / i) {
                answer = i;
                if (pouches[i - 1] != 90) {
                    alterAnswer = pouches[i - 1];
                }
            }
        }

        if (answer == 0) {
            System.out.println("Array is ideal :)");
        } else if (alterAnswer != 0 && alterAnswer != 0) {
            System.out.println("Pouch with number " + answer + " has " + alterAnswer + "grams. Follow the terms of the task !");
        } else {
            System.out.println("Pouch with number " + answer + " has 90 grams");
        }
    }
}
