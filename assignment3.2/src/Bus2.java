public class Bus2 extends AbstractVehicle {
    private int capacity;

    public Bus2() {
        super("Diesel", "White", 24);
        capacity = 40;
    }

    public void start() {
        System.out.println("Bus is starting...");
    }

    public void stop() {
        System.out.println("Bus is stopping...");
    }

    public String getInfo() {
        return "Bus Information:\n"
                + "Fuel: " + fuel + "\n"
                + "Color: " + color + "\n"
                + "Capacity: " + capacity + " passengers";
    }
}
