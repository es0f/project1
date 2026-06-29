public abstract class AbstractVehicle implements Vehicle {
    protected String fuel;
    protected String color;
    protected double fuelEfficiency;

    public AbstractVehicle(String fuel, String color, double fuelEfficiency) {
        this.fuel = fuel;
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void honk() {
        System.out.println("Beeeeeeeeeeeeeeep");
    }
    public void charge() {
        System.out.println("Not possible to charge.");
    }
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}