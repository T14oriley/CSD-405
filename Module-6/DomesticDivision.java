//CSD405 Tyler O'Riley 06/14/2023 Assignment 6
//Java program to examine abstraction using division classes

class DomesticDivision extends Division {   //extend to use Division class
    String state;

    void divInfo() {   //Local divInfo to run abstract method of parent class
        System.out.println("Domestic information as follows\n");
        System.out.println("Division: " + compDivName);
        System.out.println("State: " + state);
        System.out.println("Account: " + compAccNumber);
    }

    DomesticDivision(String compDivName, String state,  int compAccNumber) {  
        super(compDivName, compAccNumber); //super to indicate variable are used from parent class Division
        this.state = state;
    }
}