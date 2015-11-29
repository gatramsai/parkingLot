/**
 * Created by Sai Gatram on 11/27/2015.
 */
public class Bus extends Vehicle
{
       public Bus() {
        spotsNeeded = 5;
        vehicleSize = "large";
    }
    public void print() {
        System.out.print("B");
    }

    public  boolean canFitInSpot(ParkingSpot spot)
    {
        return spot.getSpotSize() == "large";
    }
}
