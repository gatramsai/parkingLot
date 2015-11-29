/**
 * Created by Sai Gatram on 11/27/2015.
 */
public class ParkingSpot
{
    private Vehicle vehicle;
    private String spotSize;
    private int row;
    private Level level;
    private int spotNumber;

    public ParkingSpot(int spotNumber, Level level, String spotSize, int row) {
        this.spotNumber = spotNumber;
        this.level = level;
        this.spotSize = spotSize;
        this.row = row;
    }

    public boolean isSpotTaken() {return vehicle == null;}

    public boolean ifFit(Vehicle vehicle) {
        return isSpotTaken() && vehicle.canFitInSpot(this);
    }

    public String getSpotSize()
    {
        return spotSize;
    }

    public void print() {
        if (vehicle == null) {
            if (spotSize == "compact") {
                System.out.print("c");
            } else if (spotSize == "large") {
                System.out.print("l");
            } else if (spotSize == "motorcycle") {
                System.out.print("m");
            }
        } else {
            vehicle.print();
        }
    }

    public int getRow() {
        return row;
    }

    public boolean park(Vehicle v) {
        if (!ifFit(v)) {
            return false;
        }
        vehicle = v;
        vehicle.parkInSpot(this);
        return true;
    }
}
