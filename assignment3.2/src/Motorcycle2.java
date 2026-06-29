public class Motorcycle2 extends AbstractVehicle {
    public Motorcycle2() {
        super("Gasoline", "Black", 16);
    }

    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    public String getInfo() {
        return "Motorcycle Information:\n"
                + "Fuel: " + fuel + "\n"
                + "Color: " + color;
    }
}
