/**
 * Created by Sai Gatram on 11/27/2015.
 */
public class ParkingLot {
    private final int NUM_OF_LEVELS = 5;
    private Level[] levels;

    public ParkingLot()
    {
        levels = new Level[NUM_OF_LEVELS];
        for (int i = 0; i < NUM_OF_LEVELS; i++) {
            levels[i] = new Level(i, 30);
        }

    }
/*
    public boolean parkVehicle(Vehicle vehicle) {
        for (int i = 0; i < levels.length; i++) {
            if (levels[i].parkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }
*/
}
