package WithStrategyPattern;

import WithStrategyPattern.Strategy.SportDriveStrategy;

public class offRoadVehicle extends Vehicle{
    offRoadVehicle(){
        super(new SportDriveStrategy());
    }
}
