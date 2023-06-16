package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.make = 2023;
        honda.color = "Silver";
        honda.transmission = "Manual";

        //Calling Car class method
        honda.displayCharacteristics();
        honda.accelerate();
        honda.brake();
    }
}
 class Car {
    String color, transmission;
    int make, tyres, doors;

    //Constructor
    Car() {
        tyres = 4;
        doors = 4;
    }

    //Class Methods
    public void displayCharacteristics(){
        System.out.println("Car color : " + color);
        System.out.println("Make year of car : " + make);
        System.out.println("Car transmission : " + transmission);
        System.out.println("No. of doors : " + doors);
        System.out.println("No. of tyres : " + tyres);
    }
    public void accelerate() {
        System.out.println("Car is moving forward.");
    }
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
