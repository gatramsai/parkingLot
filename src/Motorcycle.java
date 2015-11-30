/*
Name: Sai Gatram
Class and Section: 2336.002
Purpose of Class: This is the motorcycle class. This class will be used to define the motorcycle. The motorcycle has unique qualities to it. The size of the motorcycle is 1 spots and it can fit in all spaces.
    The motorcycle prints M once parked. The purpose of this class is to allow us to create motorcycle objects.
*/
public class Motorcycle extends Vehicle
{
    public Motorcycle()
    {
        spotsNeeded = 1;
        vehicleSize = "motorcycle";
    }

    public  boolean canFitInSpot(ParkingSpot spot)//the motorcycle fits in all spots
    {
        return true;
    }
    public void print() {
        System.out.print("M");
    }

    //This overridden to string class allows me to print the type of vehicle that does not have any places in the parking lot anymore. This makes it more clear which vehicle has no space before termination.
    @Override
    public String toString() {
        return "Motorcycle";
    }
}
