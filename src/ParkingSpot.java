/*
Name: Sai Gatram
Class and Section: 2336.002
Purpose of Class: This is the ParkingSpot class. This class will be used to define the ParkingSpot. The ParkingSpot has unique qualities to it. The ParkingSpot is just one space. The ParkingSpot is a apart
    of the level and the parkingLot. Since the level class HAS A parkingSpot in it, the parking lot HAS A ParkingSpot also. This is what will be called because of the aggregation relationship it has
    with level and parkingspot. The parkingSpot has variable to store, the vehicle, the spotSize as a string, and the row.
*/
public class ParkingSpot
{
    private Vehicle vehicle;
    private String spotSize;
    private int row;
   // private Level level;
   // private int spotNumber;

    //This is the constructor for the parking spot. It is called in the level class multiple times. All it needed in the spotsize and the row.
    public ParkingSpot(String spotSize, int row) {// public ParkingSpot(int spotNumber, Level level, String spotSize, int row) {
        //this.spotNumber = spotNumber;
        //this.level = level;
        this.spotSize = spotSize;
        this.row = row;
    }


    public boolean isSpotTaken() {return vehicle == null;}

    // This method calls the spotTaken fucntion and checks if the space is taken and if the space can fit the veghicle whixh is the fucntion parameter.
    public boolean ifFit(Vehicle vehicle) {
        return isSpotTaken() && vehicle.canFitInSpot(this);
    }

    public String getSpotSize()
    {
        return spotSize;
    }

    //This fucntion just prints the spot sizes when they are not occupied by a vehicle is a readible way.
    public void print() {
        if (vehicle == null)
        {
            if (spotSize .equals("compact") ) {
                System.out.print("c");
            } else if (spotSize .equals("large") ) {
                System.out.print("l");
            } else if (spotSize .equals("motorcycle") ) {
                System.out.print("m");
            }
        }
        else
        {
            vehicle.print();
        }
    }

    public int getRow() {
        return row;
    }

    // This fucntion occupies the vehicle variable in the parkingSpot object, with the vehicle provided in the fucntion call. It is called by level in the parkAtSpot fucntion.
    public boolean park(Vehicle v)
    {
        if (ifFit(v)==false)
        {
            return false;
        }
        vehicle = v;
        return true;
    }
}
