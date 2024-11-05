public class Car {
    // instance fields/ attributes
    private String make;
    private String model;
    private int year;
    private double price;

    // static method
    public static int carCount = 0;

    // no arg constructor
    public Car() {
        carCount++;
    }

    // all arguments constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        carCount++; // increment car count
    }

    // 3 arguments constructor
    public Car(String make, String model, int year) {
        this(make, model, year, 0);
    }

    // copy constructor
    public Car(Car car) {
        this(car.make, car.model, car.year, car.price);
    }

    // Getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // instance to string method
    @Override
    public String toString() {
        return "🚗 [make= " + make + ", model= " + model + ", year= " + year + ", price= " + price + "]";
    }

    // static getter method to get carCount value
    public static int getCarCount() {
        return carCount;
    }
}
