//CSD405 Tyler O'Riley 06/25/2023 Assignment 8
//Java program viewing cards using JavaFX

import java.lang.Math;

public class cardGame {
    public static void main(String[] args) {
            int cardNumOne = (int)(Math.random() * 54 + 1);
            int cardNumTwo = (int)(Math.random() * 54 + 1);
            int cardNumThree = (int)(Math.random() * 54 + 1);
            int cardNumFour = (int)(Math.random() * 54 + 1);
            System.out.println(cardNumOne);
            System.out.println(cardNumTwo);
            System.out.println(cardNumThree);
            System.out.println(cardNumFour);
        }
    }