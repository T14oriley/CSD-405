//CSD405 Tyler O'Riley 05/29/2023 Assignment 2
//Java program to create the Fan Class and test various functions

class Fan{
    final int STOPPED = 0; //Setting class attributes
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = STOPPED;
    private int radius = 6;
    private boolean on;

    String color = "white";

    public String getColor() { //Getters for mutable variables
        return this.color;
    }
    public int getRadius() {
        return this.radius;
    }
    public boolean getOn() {
        return this.on;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void setColor(String newColor) { //Setters for mutable variables
        this.color = newColor;
    }
    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }
    public void setOn(boolean newOn) {
        this.on = newOn;
    }
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public Fan() {                  //No argument constructor same as default constructor which sets default values
        this.speed = this.STOPPED;
        this.radius = 6;
        this.on = true;
        this.color = "white";
    }

    public Fan(int spd, int rad, boolean fanOn, String clr) {  // Argument constructor overwrites default constructors with custom constructors
        this.speed = spd;
        this.radius = rad;
        this.on = fanOn;
        this.color = clr;
    }

    public void fanState() { //Prints the fan it is attached to (fan5.fanState)
        System.out.println("Fan Speed: " + this.speed);
        System.out.println("Fan Radius: " + this.radius);
        System.out.println("Fan is On: " + this.on);
        System.out.println("Fan Color: " + this.color);
    }


}

class UseFans { //Runs Code
    public static void main(String[] args) {
        Fan newFan = new Fan();                 //Creates default fan from default constructor
        Fan newFan1 = new Fan(2, 8, false, "Purple");  //creates custom fan from custom constructor
        Fan newFan2 = new Fan(3, 4, true, "Rainbow");

        Fan fanList[] = {newFan, newFan1, newFan2};

        showFans(fanList);
        returnFan(newFan2);
    }
    public static void showFans(Fan fanList[]) {
        for(int idx=0; idx < fanList.length; idx++) {
            System.out.println("FAN " + (idx + 1));
            System.out.println("Fan Speed: " + fanList[idx].getSpeed());
            System.out.println("Fan Radius: " + fanList[idx].getRadius());
            System.out.println("Fan is On: " + fanList[idx].getOn());
            System.out.println("Fan Color: " + fanList[idx].getColor());
        }
    }

    public static void returnFan(Fan givenFan) {     //Returns information about GIVEN fan
        System.out.println("Fan Speed: " + givenFan.getSpeed());
        System.out.println("Fan Radius: " + givenFan.getRadius());
        System.out.println("Fan is On: " + givenFan.getOn());
        System.out.println("Fan Color: " + givenFan.getColor());
    }
}