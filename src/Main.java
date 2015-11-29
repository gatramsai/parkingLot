/*
Name: Sai Gatram
Class and Section: 2336.002
Purpose of Class: This is the main class that will be used for testing the code. Without this the program would not work.
 */


public class Main {

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot();
        lot.print();
        Vehicle v = new Bus();
        lot.parkVehicle(v);
        lot.print();

        Vehicle c = new Car();
        lot.parkVehicle(c);
        lot.print();
/*
        while (v == null || lot.parkVehicle(v)) {
            lot.print();
            int r = (int) (Math.random()*10);
            if (r < 2) {
                v = new Bus();
            } else if (r < 4) {
                v = new Motorcycle();
            } else {
                v = new Car();
            }
            System.out.print("\nParking a ");
            v.print();
            System.out.println("");
        }
        System.out.println("Parking Failed. Final state: ");
        lot.print();
*/
    }
}

