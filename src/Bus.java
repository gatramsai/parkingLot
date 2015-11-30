/*
Name: Sai Gatram
Class and Section: 2336.002
Purpose of Class: This is the Bus class. This class will be used to define the bus. The bus has unique qualities to it. The size of the bus is 5 spots and it can only fit in large spaces.
    The Bus prints B once parked. The purpose of this class is to allow us to create bus objects.
*/

public class Bus extends Vehicle
{
       public Bus() {
        spotsNeeded = 5;
        vehicleSize = "large";
    }
    public void print() {
        System.out.print("B");
    }// The bus can only fit in large spots

    public  boolean canFitInSpot(ParkingSpot spot)
    {
        return spot.getSpotSize() .equals("large") ;
    }

    //This overridden to string class allows me to print the type of vehicle that does not have any places in the parking lot anymore. This makes it more clear which vehicle has no space before termination.
    @Override
    public String toString() {
        return "Bus";
    }
}
