/**
 * Created by Sai Gatram on 11/27/2015.
 */
public class Level {
    private int level;
    private ParkingSpot[] spots;
    private int availableSpots = 0;
    private static final int SPOTS_PER_ROW = 10;

    public Level(int numberOfSpot, int level)
    {
        this.level = level;
        spots = new ParkingSpot[numberOfSpot];
        int busSpots = numberOfSpot/5;
        int motorcycleSpots = numberOfSpot/5;
        int carSpots = numberOfSpot-busSpots-motorcycleSpots;

        for (int spotNumber = 0 ; spotNumber < busSpots;spotNumber++)
        {
            String spotSize = "large";
            int row = spotNumber/SPOTS_PER_ROW;
            spots[spotNumber]=new ParkingSpot(spotNumber,this,spotSize,row);
        }

        for (int spotNumber = busSpots , k=0; k < carSpots; spotNumber++,k++)
        {
            String spotSize = "compact";
            int row = spotNumber/SPOTS_PER_ROW;
            spots[spotNumber]=new ParkingSpot(spotNumber,this,spotSize,row);
        }

        for (int spotNumber = carSpots+busSpots , k=0; k < motorcycleSpots; spotNumber++,k++)
        {
            String spotSize = "motorcycle";
            int row = spotNumber/SPOTS_PER_ROW;
            spots[spotNumber]=new ParkingSpot(spotNumber,this,spotSize,row);
        }

        availableSpots = numberOfSpot;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void print() {
        int lastRow = 6;//this just has to not be 0 for the increment to be placed in the first row (or the zero row)
        for (int i = 0; i < spots.length; i++) {
            ParkingSpot spot = spots[i];
            if (spot.getRow() != lastRow) {
                System.out.print("  ");
                lastRow = spot.getRow();
            }
            spot.print();
        }
        System.out.println(" ");
    }
    public boolean parkVehicle(Vehicle vehicle){
        int spotNumber = findOpenSpots(vehicle);
        if (spotNumber < 0) {
            return false;
        }
        if (getAvailableSpots() < vehicle.getSpotsNeeded()) {
            return false;
        }

        return parkStartingAtSpot(spotNumber, vehicle);
    }

    private int findOpenSpots(Vehicle vehicle) {
        int spotsNeeded = vehicle.getSpotsNeeded();
        int lastRow = -1;
        int spotsFound = 0;
        for (int i = 0; i < spots.length; i++) {
            ParkingSpot spot = spots[i];
            if (lastRow != spot.getRow()) {
                spotsFound = 0;
                lastRow = spot.getRow();
            }
            if (spot.ifFit(vehicle)) {
                spotsFound++;
            } else {
                spotsFound = 0;
            }
            if (spotsFound == spotsNeeded) {
                return i - (spotsNeeded - 1);
            }
        }
        return -1;
    }
    private boolean parkStartingAtSpot(int spotNumber, Vehicle vehicle) {
        boolean success = true;
        for (int i = spotNumber; i < spotNumber + vehicle.getSpotsNeeded(); i++) {
            success &= spots[i].park(vehicle);
        }
        availableSpots -= vehicle.getSpotsNeeded();
        return success;
    }

}
