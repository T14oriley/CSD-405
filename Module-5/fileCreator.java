//CSD405 Tyler O'Riley 06/11/2023 Assignment 5
//Java program for Array evaluation using methods and practice on creating new files

import java.lang.Math;      //Math class with various built in methods
import java.util.Scanner;
import java.io.File;        //File class to allow file manipulation/creation
import java.io.IOException; //Exception class to throw error if file cannot be created.
import java.io.FileWriter;  //Writer class to allow writing text to the new file

public class fileCreator{
    public static void main(String [] args){

        File fileCreator = new File("data.txt"); //File() to create new data file

        try {
            if(fileCreator.createNewFile()) {   //if "data" does exist, write new values to file
                FileWriter fileEdit = new FileWriter("data.txt"); //creating fileEdit object to write to new file
                for(int x = 0; x < 10; x++) {
                    int ranNum = (int)(Math.random()* 300 + 1); //absolute Int value of anything between 1 and 300
                    fileEdit.write(ranNum + " ");     
                }
            }
            else {
                FileWriter fileEdit = new FileWriter("data.txt", true); //If "data" does not exist, create it and write new values
                fileEdit.write("\n");
                for(int x = 0; x < 10; x++) {
                    int randInt = (int)(Math.random()* 300 + 1);
                    fileEdit.write(randInt + " ");    
                }
                fileEdit.close();  
            }
        }
        catch(Exception err) {   //catch if error is thrown when file is accessed/created
            System.out.println("An error has occurred");
            err.printStackTrace();
        }

        try{
            Scanner fileReader = new Scanner(fileCreator); //scanner creation to review file

            System.out.println("\n");

            while (fileReader.hasNextLine()) {  //While loop to read each line of file as long as a next one exists
                String fileLine = fileReader.nextLine(); //fileLine object for outputting each line
                System.out.println(fileLine);
            }
            fileReader.close(); //close fileReader as we are finished using it
        }
        catch(Exception err) {
            System.out.println("An error has occurred. The file you have requested does not exist.");
        }
        System.out.println("\n");
    }
}