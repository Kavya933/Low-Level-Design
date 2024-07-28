package WithStrategyPattern.Strategy;

import WithStrategyPattern.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    public void drive(){
        System.out.println("Normal Drive Capability");
    }
}
