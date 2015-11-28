/**
 * Created by Sai Gatram on 11/27/2015.
 */
public abstract class Vehicle {
    ParkingSpot[] parkingSpots= new ParkingSpot[50];

    protected int spotsNeeded;
    protected String vehicleSize;

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public String getVehicleSize() {
        return vehicleSize;
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);
}
