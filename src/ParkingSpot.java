/**
 * Created by Sai Gatram on 11/27/2015.
 */
public class ParkingSpot {
    private Vehicle vehicle;
    private String spotSize;
    private int row;
    private Level level;

    public ParkingSpot(int row, Level level, String spotSize, Vehicle vehicle) {
        this.row = row;
        this.level = level;
        this.spotSize = spotSize;
        this.vehicle = vehicle;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public String getSpotSize() {
        return spotSize;
    }
}
