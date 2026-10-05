abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void startEngine();
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public void startEngine() {
        System.out.println(getBrand() + " engine started with a roar.");
    }

    public void displayInfo() {
        System.out.println("This is a " + getBrand() + " car with " + doors + " doors.");
    }

    public void displayInfo(String owner) {
        System.out.println(owner + "'s " + getBrand() + " car with " + doors + " doors.");
    }
}

public class oops {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        
        myCar.startEngine();
        myCar.displayInfo();
        myCar.displayInfo("Alice");
    }
}

