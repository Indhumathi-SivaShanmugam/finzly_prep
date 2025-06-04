import java.util.ArrayList;
import java.util.List;

// ===== 1. ABSTRACTION =====
abstract class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public abstract void start();

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// ===== 2. INHERITANCE =====
class Car extends Vehicle {
    private int numDoors;

    public Car(String model, int year, int numDoors) {
        super(model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        System.out.println("Car is starting with a key turn...");
    }

    public void honk() {
        System.out.println("Beep beep!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numDoors);
    }
}

class ElectricBike extends Vehicle {
    private int batteryRange;

    public ElectricBike(String model, int year, int batteryRange) {
        super(model, year);
        this.batteryRange = batteryRange;
    }

    @Override
    public void start() {
        System.out.println("E-bike is powering on with a button press...");
    }

    public void checkBattery() {
        System.out.println("Battery range: " + batteryRange + " miles");
    }
}

// ===== Main class containing the main method =====
public class oops4vehicleMngmt {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Camry", 2022, 4);
        ElectricBike myBike = new ElectricBike("Rad Power", 2023, 45);

        myCar.displayInfo();
        myCar.start();
        myCar.honk();

        System.out.println("\n------\n");

        myBike.displayInfo();
        myBike.start();
        myBike.checkBattery();

        System.out.println("\n------\nTreating all vehicles generically:");
        List<Vehicle> garage = new ArrayList<>();
        garage.add(myCar);
        garage.add(myBike);

        for (Vehicle v : garage) {
            v.start();
            v.displayInfo();
            System.out.println("------");
        }
    }
}
