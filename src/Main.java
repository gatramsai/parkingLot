/*
Name: Sai Gatram
Class and Section: 2336.002
Purpose of Class: This is the main class that will be used for testing the code. Without this the program would not work. This part will create an instant of the parking lot which allows us to use the
    parking lot functions.
*/


public class Main {

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot();
        System.out.println("Print the empty parkingLot");
        lot.print();

        Vehicle ggg = new Motorcycle();
        lot.parkVehicle(ggg);
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
        Vehicle m6ttt = new Bus();
        lot.parkVehicle(m6ttt);
        lot.print();
        Vehicle m6tttt = new Bus();
        lot.parkVehicle(m6tttt);
        lot.print();
        Vehicle m6ttttt = new Bus();
        lot.parkVehicle(m6ttttt);
        lot.print();
        Vehicle m6tttttttt = new Car();
        lot.parkVehicle(m6tttttttt);
        lot.print();
        Vehicle m6ttttttt = new Bus();
        lot.parkVehicle(m6ttttttt);
        lot.print();

    }
}

