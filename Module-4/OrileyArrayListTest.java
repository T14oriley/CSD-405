//CSD405 Tyler O'Riley 06/08/2023 Assignment 4
//Java program for Array evaluation using methods


import java.util.ArrayList;
import java.util.Scanner;

public class OrileyArrayListTest {
    public static void main(String[] args) {
        int newVal;

        System.out.println("\nEnter number values into the list.");
        System.out.println("\nEnter 0 when you are finished assigning value.");

        ArrayList<Integer> customList = new ArrayList<Integer>(); //Array creation using Integer to wrap primitive values for object use

        Scanner newScan = new Scanner(System.in);
        do {                                         
            newVal = newScan.nextInt(); //Do While loop so user can keep entering values until 0 is selected
            customList.add(newVal);
        }while(newVal != 0);

        System.out.print("Your array's largest value is " + max(customList));
    }

        public static Integer max(ArrayList cList) {    //max method with if statement to determine largest or if no values entered
            int Largest = 0;
            if(cList.size() == 0){
                return 0;
            }
            else {
                for(int x = 0; x < cList.size(); x++) {
                    if((int)cList.get(x) > Largest) {
                        Largest = (int)cList.get(x);
                    }
                }
            }
            return Largest;
        }
}