package WithStrategyPattern.Strategy;

import WithStrategyPattern.DriveStrategy;

public class SportDriveStrategy implements DriveStrategy {
    public void drive(){
        System.out.println("Special drive capability");
    }
}
