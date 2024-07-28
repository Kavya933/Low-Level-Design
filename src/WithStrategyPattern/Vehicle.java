package WithStrategyPattern;

public class Vehicle {
    DriveStrategy driveObject;  // object of an interface to have dynamic

    // Constructor injection of driveObject
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }
}
