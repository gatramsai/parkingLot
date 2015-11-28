/**
 * Created by Sai Gatram on 11/27/2015.
 */
public class Bus extends Vehicle{
       public Bus() {
        spotsNeeded = 5;
        vehicleSize = "large";
    }

    public  boolean canFitInSpot(ParkingSpot spot)
    {
        return spot.getSpotSize().equals("large");
    }
}
