import java.util.ArrayList;

/**
 * Created by Sai Gatram on 11/27/2015.
 */
public abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();

    protected int spotsNeeded;
    protected String vehicleSize;

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public String getVehicleSize() {
        return vehicleSize;
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);
    public abstract void print();

    public void parkInSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }
}
