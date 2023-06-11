//CSD405 Tyler O'Riley 06/11/2023 Assignment 5
//Java program analyzing user input using autoboxing and try/catch

import java.util.ArrayList;
import java.util.Scanner;

public class customArray{
    
    public static void main(String [] args){
        Scanner newScanner = new Scanner(System.in);
        int drinkID = 0; //int to display the value of array item selected

        ArrayList<String> stringOptions = new ArrayList<String>(); //stringOptions object to act as wrapper for array strings

        stringOptions.add("Coke");  //add method to insert each string value into wrapped array
        stringOptions.add("Pepsi");
        stringOptions.add("Dr Pepper");
        stringOptions.add("Mugs");
        stringOptions.add("Barqs");
        stringOptions.add("Mellow Yellow");
        stringOptions.add("Sprite");
        stringOptions.add("Greenleaf");
        stringOptions.add("Lemonade");
        stringOptions.add("Mountain Dew");

        System.out.println("\nSoda options are: ");

        for(String x : stringOptions) {     //string x for each string to be displayed from stringOptions
            System.out.println(drinkID + ": " + x);
            drinkID++;
        }


        try {
            System.out.println("\nChoose a soda you would like.");
            Integer drinkChoice = newScanner.nextInt();     //User input for drink. needs to be array value of drink. 0-9
            System.out.println("\nYou selected: " + drinkChoice);
            System.out.println("now dispensing a: " + stringOptions.get(drinkChoice)); //selection attempt to match input to array value
        }
        catch(Exception err) {
            System.out.println(err.getMessage()); //error display if user does not enter matchable array value
            System.out.println("\nBased on the above error, your selection is 'out of bounds'");
        }        

    }
}