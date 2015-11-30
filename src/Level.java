/*
Name: Sai Gatram
Class and Section: 2336.002
Purpose of Class: This is the level class. This class will be used to define the level. The level has unique qualities to it. The level lot has 30 spaces. This level HAS A level parkingSpot array in it. Since the
    level class HAS A parkingSpot in it, the parking lot HAS A ParkingSpot also. This is what will be called because of the aggregation relationship it has with level and parkingspot. The available spots variable stores
    how many variables are in the level. The Level also has 3 rows which consist of 10 spots.
*/
public class Level {
    private int level;
    private ParkingSpot[] spots;
    private int availableSpots = 0;
    private static final int SPOTS_PER_ROW = 10;

    // This is the constructor for Level. It creates each level with 6 Large spots, 18 compact spots, and 6 motor cycle spots. The parameters are the nubmer of spots which is hardcoded to 30, and the level 0 to 4.
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
            spots[spotNumber]=new ParkingSpot(spotSize,row);// spots[spotNumber]=new ParkingSpot(spotNumber,this,spotSize,row);
        }

        for (int spotNumber = busSpots , k=0; k < carSpots; spotNumber++,k++)
        {
            String spotSize = "compact";
            int row = spotNumber/SPOTS_PER_ROW;
            spots[spotNumber]=new ParkingSpot(spotSize,row);//spots[spotNumber]=new ParkingSpot(spotNumber,this,spotSize,row);
        }

        for (int spotNumber = carSpots+busSpots , k=0; k < motorcycleSpots; spotNumber++,k++)
        {
            String spotSize = "motorcycle";
            int row = spotNumber/SPOTS_PER_ROW;
            spots[spotNumber]=new ParkingSpot(spotSize,row);//spots[spotNumber]=new ParkingSpot(spotNumber,this,spotSize,row);
        }
        availableSpots = numberOfSpot;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    // This method prints the level. This also increments based on row. Each row has 10 spaces, so every 10 spaces there is an increment.
    public void print() {
        int lastRow = -10;//this just has to not be 0 for the increment to be placed in the first row (or the zero row)
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

    // This method allows the parkingLot to park vehicles. What it does is check if the vehicle can be parked by checking the available spots and spots needed. If it can be parked it calls the park fucntion.
    public boolean parkVehicle(Vehicle vehicle){
        int spotNumber = findOpenSpots(vehicle);
        if (spotNumber < 0) {
            return false;
        }
        if (getAvailableSpots() < vehicle.getSpotsNeeded()) {
            return false;
        }
        return parkAtSpot(spotNumber, vehicle);
    }

    // This fucntion is used to find open spots. The paramters are the vehicle type which has the spots need to park the specific vehicle. The function checks if the vehicle can fit in the space
    // by checking if empty and if the space is the correct size. If the vehicle can park it will return the spot number to spark the vehicle. If not, the vehicle wont return a valid spot.
    private int findOpenSpots(Vehicle vehicle) {
        int spotsNeeded = vehicle.getSpotsNeeded();
        int lastRow = -10;//this just has to not be 0 for the increment to be placed in the first row (or the zero row)
        int spacesFound = 0;
        for (int i = 0; i < spots.length; i++) {
            ParkingSpot space = spots[i];
            if (lastRow != space.getRow()) {
                spacesFound = 0;
                lastRow = space.getRow();
            }
            if (space.ifFit(vehicle)) {
                spacesFound++;
            } else {
                spacesFound = 0;
            }
            if (spacesFound == spotsNeeded) {
                return i - (spotsNeeded - 1);
            }
        }
        return -1;
    }

    // This method will actually park the vehicle. The parameters are the spot number and the vehicle type. The spot number is received from the findOpenSpots fucntion. After parking it will decrement the amount
    // of available spaces to park. It will return true because the fucntion that checks if the vehicle can be parked has already run.
    private boolean parkAtSpot(int spotNumber, Vehicle vehicle) {
        for (int i = spotNumber; i < spotNumber + vehicle.getSpotsNeeded(); i++) {
            spots[i].park(vehicle);
        }
        availableSpots -= vehicle.getSpotsNeeded();
        return true;
    }

}
