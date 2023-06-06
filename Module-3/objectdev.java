//CSD405 Tyler O'Riley 06/05/2023 Assignment 3
//Java program to continue object tests


public class objectdev{
    private int TylerInteger; //Setting constructor to initialize TylerInteger
    objectdev(int x) {
        this.TylerInteger = x;
    }    


    public int getTylerInt() {   //Getter and Setter methods
        return this.TylerInteger;
    }
    public void SetTylerInt(int x) {
        this.TylerInteger = x;
    }


    public boolean isEven() {       //Non-Parameter methods for boolean testing
        return (this.TylerInteger % 2 == 0); //Can only run with This object
    }
    public boolean isOdd() {
        return !(this.TylerInteger % 2 == 0);
    }
    public boolean isPrime() {
        int split = this.TylerInteger/2;
        int test = 0;
        if(this.TylerInteger < 2) { //if to exclude 0 and 1 (not prime numbers)
            return false;
        }
        else {
            for(int i = 2; i <= split; i++) {   //for loop to test divisibility to ensure number is a prime variable
                if(this.TylerInteger % i == 0) { //Divisible by itself and one only
                    test = 1;
                    break;
                }
            }
        } 
        if(test == 0) {
            return true;
        }
        else {
            return false;
        }
    }


    static boolean isEven(int x) { //Static methods that use parameters vs specific object
        return (x % 2 == 0);        //This helps avoid overloading by allowing methods to be
    }                               //separated by their parameters
    static boolean isOdd(int x) {
        return !(x % 2 ==0);
    }
    static boolean isPrime(int x) {
        int split = x/2;
        int test = 0;
        if(x < 2) {
            return false;
        }else{
            for(int i = 2; i <= split; i++) {
                if(x % i == 0) {
                    test = 1;
                    break;
                }
            }
        } 
        if(test == 0) {
            return true;
        }else {
            return false;
        }
    }

    static boolean isEven(Integer x) {      //Integers allow for better flexibility within wrappers
        return (Integer.valueOf(x) % 2 == 0);   //and methods.
    }
    static boolean isOdd(Integer x) {
        return !(Integer.valueOf(x) % 2 ==0);
    }
    static boolean isPrime(Integer x) {
        int val = Integer.valueOf(x);
        int half = val/2;
        int test = 0;
        if(val < 2) {
            return false;
        }else{
            for(int i = 2; i <= half; i++) {
                if(val % i == 0) {
                    test = 1;
                    break;
                }
            }
        } 
        if(test == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean equals(int x) {
        return(x == this.TylerInteger);
    }
    public boolean equals(Integer x) {
        return(Integer.valueOf(x) == this.TylerInteger);
    }

    public static void main(String [] args){
        Integer y = 54;
        objectdev one = new objectdev(5);
        objectdev two = new objectdev(y);
        objectdev three = new objectdev(7);

        System.out.println("\n\nObject test one using Int 5: ");   //Method testing using various integer inputs
        System.out.println("even: " + one.isEven());
        System.out.println("odd: " + one.isOdd());
        System.out.println("prime: " + one.isPrime());

        System.out.println("\n\nObject test two using Int 54: ");
        System.out.println("even: " + two.isEven());
        System.out.println("odd: " + two.isOdd());
        System.out.println("prime: " + two.isPrime());

        System.out.println("\n\nObject test three using Int 7: ");
        System.out.println("even: " + three.isEven());
        System.out.println("odd: " + three.isOdd());
        System.out.println("prime: " + three.isPrime());

        System.out.println("\n\nTesting static int methods with values 3, 3, and 18: ");
        System.out.println("even: " + objectdev.isEven(3));
        System.out.println("odd: " + objectdev.isOdd(3));
        System.out.println("prime: " + objectdev.isPrime(18));

        Integer i1 = 3;
        Integer i2 = 3;
        Integer i3 = 18;
        System.out.println("\n\nStatic Method Test with Integers for values 3, 3, and 18: ");
        System.out.println("even: " + objectdev.isEven(i1));
        System.out.println("odd: " + objectdev.isOdd(i2));
        System.out.println("prime: " + objectdev.isPrime(i3));

        System.out.println("\n\nInt equals method with value 3 after setting TylerInteger to 3: ");
        one.SetTylerInt(3);
        System.out.println(one.equals(3));
        System.out.println("Testing int equals method with value 5 after setting TylerInteger to 10: ");
        one.SetTylerInt(10);
        System.out.println(one.equals(5));

        System.out.println("\n\nTesting Integer equals method for Integer value 5 after setting TylerInteger to 5: ");
        two.SetTylerInt(5);
        System.out.println(two.equals(i1));
        System.out.println("Testing Integer equals method for Integer value 5 after setting TylerInteger to 10: ");
        two.SetTylerInt(10);
        System.out.println(two.equals(i1));
    }
}