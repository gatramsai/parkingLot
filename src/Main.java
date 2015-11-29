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

        Vehicle g = new Car();
        lot.parkVehicle(g);
        lot.print();
        Vehicle h = new Car();
        lot.parkVehicle(h);
        lot.print();
        Vehicle a = new Car();
        lot.parkVehicle(a);
        lot.print();
        Vehicle d = new Car();
        lot.parkVehicle(d);
        lot.print();
        Vehicle n = new Car();
        lot.parkVehicle(n);
        lot.print();
        Vehicle m = new Motorcycle();
        lot.parkVehicle(m);
        lot.print();
        Vehicle m1 = new Motorcycle();
        lot.parkVehicle(m1);
        lot.print();
        Vehicle m2 = new Motorcycle();
        lot.parkVehicle(m2);
        lot.print();
        Vehicle m3 = new Motorcycle();
        lot.parkVehicle(m3);
        lot.print();
        Vehicle m4 = new Motorcycle();
        lot.parkVehicle(m4);
        lot.print();
        Vehicle m5 = new Motorcycle();
        lot.parkVehicle(m5);
        lot.print();
        Vehicle m6 = new Motorcycle();
        lot.parkVehicle(m6);
        lot.print();
        Vehicle m61 = new Motorcycle();
        lot.parkVehicle(m6);
        lot.print();
        Vehicle m612 = new Motorcycle();
        lot.parkVehicle(m612);
        lot.print();
        Vehicle m613 = new Motorcycle();
        lot.parkVehicle(m613);
        lot.print();
        Vehicle m611 = new Motorcycle();
        lot.parkVehicle(m611);
        lot.print();
        Vehicle m6111 = new Motorcycle();
        lot.parkVehicle(m6111);
        lot.print();
        Vehicle m61111 = new Motorcycle();
        lot.parkVehicle(m61111);
        lot.print();
        Vehicle m611111 = new Motorcycle();
        lot.parkVehicle(m611111);
        lot.print();
        Vehicle m6111111 = new Car();
        lot.parkVehicle(m6111111);
        lot.print();
        Vehicle m6tt = new Bus();
        lot.parkVehicle(m6tt);
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

