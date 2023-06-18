//CSD405 Tyler O'Riley 06/14/2023 Assignment 6
//Java program to examine abstraction using division classes

class UseDivision {
    public static void main(String[] args) {
        DomesticDivision domest1 = new DomesticDivision("Division 1", "Indiana", 1234);   //object assignment for variables to be processed through parent and child classes
        DomesticDivision domest2 = new DomesticDivision("Division 2", "Ohio", 2345);

        InternationalDivision inter1 = new InternationalDivision("Division 3", "Japan", "Japanese", 874598);
        InternationalDivision inter2 = new InternationalDivision("Division 4", "Haiti", "Haitian Creole", 3623753);

        
        domest1.divInfo();   //object method execution to run through child class inherited abstract methods
        domest2.divInfo();
        inter1.divInfo();
        inter2.divInfo();
    }
}