//CSD405 Tyler O'Riley 06/14/2023 Assignment 6
//Java program to examine abstraction using division classes

class InternationalDivision extends Division {   //extend to use Division class
    String country;
    String lang;

    void divInfo() {    //Local divInfo to run abstract method of parent class
        System.out.println("International information as follows\n");
        System.out.println("Division Name: " + compDivName);
        System.out.println("Country: " + country);
        System.out.println("Language: " + lang);
        System.out.println("Account: " + compAccNumber);
    }


    InternationalDivision(String compDivName, String country, String lang, int compAccNumber) { 
        super(compDivName, compAccNumber);  //super to indicate variable are used from parent class Division
        this.country = country;
        this.lang = lang;
    }
}