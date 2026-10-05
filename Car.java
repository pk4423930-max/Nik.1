class Car {
    String brand;
    int year;

    Car(String carBrand, int carYear) {
        brand = carBrand;
        year = carYear;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2026);
        myCar.displayDetails();
    }
}

    

