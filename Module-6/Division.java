//CSD405 Tyler O'Riley 06/14/2023 Assignment 6
//Java program to examine abstraction using division classes

abstract class Division {  //abstract class with subclass variable holders
    String compDivName;
    int compAccNumber;

    abstract void divInfo();  //abstract void to display information so only child class can run method and provide objects
    Division(String compDivName, int compAccNumber) { //abstract method for child classes to use
        this.compDivName = compDivName;
        this.compAccNumber = compAccNumber;
    }
}