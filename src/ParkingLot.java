/*
Name: Sai Gatram
Class and Section: 2336.002
Purpose of Class: This is the ParkingLot class. This class will be used to define the ParkingLot. The ParkingLot has unique qualities to it. The Parking lot has 5 levels. This parking lot HAS A level array in it. Since the
    level class HAS A parkingSpot in it, the parking lot HAS A ParkingSpot also. This is what will be called because of the aggregation relationship it has with level and parkingspot.
*/
public class ParkingLot {
    private final int NUM_OF_LEVELS = 5;
    private Level[] levels;

    //This is the constructor for the parkingLot. It will create an array in which each element is a level. The amount of spots in each floor is hardcoded to 30.
    public ParkingLot()
    {
        levels = new Level[NUM_OF_LEVELS];
        for (int i = 0; i < NUM_OF_LEVELS; i++)
        {
            levels[i] = new Level(30, i);
        }
    }

    //This parking lot has no parameters. All it does is print the parkinglot in it's current state in a readible manner.
    public void print()
    {
        for (int level = 0; level < levels.length; level++) {
            System.out.print("Level " + level + ":        ");
            levels[level].print();
        }
        System.out.println(" ");
    }

    //This method will park the vehicle. It is called from the main class. Returns true and parks the vehicle if it can. If it cannot, it returns false, terminates  the program and prints the final parking lot.
    public boolean parkVehicle(Vehicle vehicle) {
        for (int i = 0; i < levels.length; i++) {
            if (levels[i].parkVehicle(vehicle)) {
                System.out.println("Parking a "+ vehicle.toString());
                return true;
            }
        }
        System.out.println("There are no more spaces for this " + vehicle.toString() + ". The program will now terminate.");
        System.out.println("The final state of the parking lot is :");
        print();
        System.exit(1);
        return false;
    }
}
