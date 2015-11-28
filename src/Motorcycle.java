/**
 * Created by Sai Gatram on 11/27/2015.
 */
public class Motorcycle extends Vehicle
{
    public Motorcycle()
    {
        spotsNeeded = 1;
        vehicleSize = "motorcycle";
    }

    public  boolean canFitInSpot(ParkingSpot spot)
    {
        return spot.getSpotSize().equals("motorcycle");
    }
}
