public class Car2 extends AbstractVehicle {
    public Car2() {
        super("Petrol", "Red", 10);
    }

    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public String getInfo() {
        return "Car Information:\n"
                + "Fuel: " + fuel + "\n"
                + "Color: " + color;
    }
}
