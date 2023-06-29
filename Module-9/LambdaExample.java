//CSD405 Tyler O'Riley 06/28/2023 Assignment 9
//Java program for basic interface syntax

//Code frame used from JavaPoint Lambda Expressions Example: https://www.javatpoint.com/java-lambda-expressions

@FunctionalInterface
interface GameboyInterface { 

    public void chooseGame();
}


public class LambdaExample { //No need for implementing as the lambda implements the interface
    public static void main(String[] args) {

        GameboyInterface game = ()-> { //lambda to assign interface variable game to landa shortcut
            System.out.println("You chose Zelda");
        };

        game.chooseGame(); //No need for further code as we are simply passing the lambda based object through the interface method
    }
    
}