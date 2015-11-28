/*
Name: Sai Gatram
Class and Section: 2336.002
Purpose of Class: This is the main class that will be used for testing the code. Without this the program would not work.
 */


public class Main {

    public static void main(String[] args) {
        /*
        Bus bus = new Bus();
        Car car = new Car();
        Motorcycle mot = new Motorcycle();
        ParkingLot park = new ParkingLot();
        */

        Level level = new Level(30,0);
        Level level1 = new Level(30,1);
        Level level2 = new Level(30,2);
        Level level3 = new Level(30,3);
        Level level4 = new Level(30,4);

        level.print();
        level1.print();
        level2.print();
        level3.print();
        level4.print();
        System.out.println();
    }
}
