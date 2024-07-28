package WithStrategyPattern;

import WithStrategyPattern.Strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SportDriveStrategy());
    }
}
