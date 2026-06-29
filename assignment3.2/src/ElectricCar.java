public class ElectricCar extends AbstractVehicle {
    public ElectricCar() {
        super("Electric", "Blue", 2);
    }

    public void start() {
        System.out.println("Electric car starting");
    }

    public void stop() {
        System.out.println("Electric car stopping");
    }

    public String getInfo() {
        return "Electric Car\n"
                + "Fuel: " + fuel + "\n"
                + "Color: " + color;
    }

    public void charge() {
        System.out.println("Electric car charging");
    }
}
