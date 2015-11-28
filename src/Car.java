/**
 * Created by Sai Gatram on 11/27/2015.
 */
public class Car extends Vehicle{
    public Car() {
        spotsNeeded = 1;
        vehicleSize = "compact";
    }
    public  boolean canFitInSpot(ParkingSpot spot)
    {
        return spot.getSpotSize().equals("compact");
    }

}
