
import java.util.ArrayList;
import java.util.List;

// ===== 1. ABSTRACTION =====
// Abstract class (cannot be instantiated, only extended)
abstract class Vehicle {
    // Encapsulated fields (private)
    private String model;
    private int year;

    // Constructor
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Abstract method (must be implemented by child classes)
    public abstract void start();

    // Concrete method (shared by all vehicles)
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    // ===== ENCAPSULATION =====
    // Getters and setters for private fields
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// ===== 2. INHERITANCE =====
// Car inherits from Vehicle
class Car extends Vehicle {
    private int numDoors;

    public Car(String model, int year, int numDoors) {
        super(model, year);  // Call parent constructor
        this.numDoors = numDoors;
    }

    // ===== 3. POLYMORPHISM =====
    // Overriding abstract method
    @Override
    public void start() {
        System.out.println("Car is starting with a key turn...");
    }

    // Unique to Car class
    public void honk() {
        System.out.println("Beep beep!");
    }

    // Overriding displayInfo() to include car-specific info
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent method
        System.out.println("Doors: " + numDoors);
    }
}

// Another child class
class ElectricBike extends Vehicle {
    private int batteryRange;

    public ElectricBike(String model, int year, int batteryRange) {
        super(model, year);
        this.batteryRange = batteryRange;
    }

    // Polymorphic implementation
    @Override
    public void start() {
        System.out.println("E-bike is powering on with a button press...");
    }

    // Unique method
    public void checkBattery() {
        System.out.println("Battery range: " + batteryRange + " miles");
    }
}

    public static void main(String[] args) {
        // ===== 4. OBJECT CREATION =====
        Car myCar = new Car("Toyota Camry", 2022, 4);
        ElectricBike myBike = new ElectricBike("Rad Power", 2023, 45);

        // Using inherited methods
        myCar.displayInfo();
        myCar.start();
        myCar.honk();  // Car-specific method

        System.out.println("\n------\n");

        myBike.displayInfo();
        myBike.start();
        myBike.checkBattery();  // Bike-specific method

        // ===== POLYMORPHISM IN ACTION =====
        System.out.println("\n------\nTreating all vehicles generically:");
        List<Vehicle> garage = new ArrayList<>();
        garage.add(myCar);
        garage.add(myBike);

        for (Vehicle v : garage) {
            v.start();  // Calls appropriate version for each vehicle
            v.displayInfo();
            System.out.println("------");
        }
    }
}