package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
         Scanner sc = new Scanner(System.in);
             inputNumber = sc.nextInt();
        }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guesses it right, it was %d\n You guessed it in %d attempts ", number, noOfGuesses);
        }
        else if (inputNumber<number){
            System.out.println("Too low");
        }
        else if (inputNumber>number){
            System.out.println("Too High");
        }

        return false;
    }
}

public class NumberGuessingGame {
    public static void main(String[] args) {
   /*
         Create a class Game, which allows a user to play "Guess the number"
         game once. Game should have the following methods:
         1. Constructor to generate the random number
         2. takeUserInput() to take a user input of number
         3. isCorrectNumber() to detect whether the number entered by the user is true
         4. getters and setters for noOfGuesses
         Use properties such as noOfGuesses(int), etc to get this task done
   */

        Game g = new Game();
        boolean b= false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
