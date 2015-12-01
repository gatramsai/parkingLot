
/*
Name: Sai Gatram
Class and Section: 2336.002
Purpose of Class: This is the Vehicle class that is made abstract. The abstract class vehicle allows us to  define a basic functionality leaving undefined parts. The class defines the spots needed and the vehicle
    size which all the bus,motorcycle, and car classes use.
*/

import java.util.ArrayList;


public abstract class Vehicle {


    //These  will be defined in each of the vehicle classes to match the class.
    protected int spotsNeeded;
    protected String vehicleSize;

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);//this will be defined in each of the vehicle classes to match the class. For instacne the motorcycle can fit in any spot.
    public abstract void print();//this will be defined in each of the vehicle classes to match the class. The bus will print B to show it has been parked.

}
