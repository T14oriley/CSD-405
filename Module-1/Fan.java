//CSD405 Tyler O'Riley 05/29/2023 Assignment 1
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
    public int getOn() {
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
    public void setOn(int newOn) {
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

    public void fanState() {
        System.out.println("Fan Speed: " + this.speed);
        System.out.println("Fan Radius: " + this.radius);
        System.out.println("Fan is On: " + this.on);
        System.out.println("Fan Color: " + this.color);
    }
}

class module1 { //Runs Code
    public static void main(String[] args) {
        Fan newFan = new Fan();                 //Creates default fan from default constructor
        System.out.println("Default Fan");
        newFan.fanState();

        Fan newFan1 = new Fan(2, 8, false, "Purple");  //creates custom fan from custom constructor
        System.out.printf("\nNew Fan\n");
        newFan1.fanState();
    }
}