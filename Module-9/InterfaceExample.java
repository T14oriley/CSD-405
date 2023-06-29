//CSD405 Tyler O'Riley 06/28/2023 Assignment 9
//Java program for basic interface syntax

//Code frame used from Alex Lee's YouTube tutorial Example: https://www.youtube.com/watch?v=kTpp5n_CppQ

interface GameboyInterface { //Your interface to house the methods and variables you plan to use/borrow for your class
    String color = "Red";

    void chooseGame();
    void reset();
}


public class InterfaceExample implements GameboyInterface { //your public class is created and implements the data from GameboyInterface for usage in your class

    public static void main(String[] args) {
        system.out.println(color);

        InterfaceExample newGB = new InterfaceExample(); //creates object to run implemented methods and returns results
        newGB.chooseGame(); //this object assignment works as newGB is calling a method that is implemented from the interface
        newGB.reset();
        
    }

    @Override //Override to for over-writing base class method
    public void chooseGame() { //this creates the class instance of chooseGame within our main class so the object can execute
        system.out.println("You chose Zelda");
    }

    @Override
    public void reset() {
        system.out.println("Your Gameboy has reset");
    }
    
}
