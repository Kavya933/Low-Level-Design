import WithStrategyPattern.GoodsVehicle;
import WithStrategyPattern.SportsVehicle;
import WithStrategyPattern.Vehicle;
import WithStrategyPattern.offRoadVehicle;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to LOW Level Design");
        Vehicle vehicle = new GoodsVehicle();  // jun class call garyo tyo run hunxa
        vehicle.drive();
    }

}