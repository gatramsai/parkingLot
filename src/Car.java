/*
Name: Sai Gatram
Class and Section: 2336.002
Purpose of Class: This is the car class. This class will be used to define the car. The car has unique qualities to it. The size of the car is 1 spots and it can only fit in compact and large spaces.
    The car prints C once parked. The purpose of this class is to allow us to create car objects.
*/
public class Car extends Vehicle{
    public Car()
    {
        spotsNeeded = 1;
        vehicleSize = "compact";
    }
    public boolean canFitInSpot(ParkingSpot spot)// The car can only fit compact and bus spots.
    {
        return spot.getSpotSize() .equals("large")  || spot.getSpotSize() .equals("compact");
    }

    public void print() {
        System.out.print("C");
    }

    //This overridden to string class allows me to print the type of vehicle that does not have any places in the parking lot anymore. This makes it more clear which vehicle has no space before termination.
    @Override
    public String toString() {
        return "Car";
    }

}
