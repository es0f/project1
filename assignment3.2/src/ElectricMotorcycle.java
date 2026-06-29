public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("Electric", "Green", 4);
    }

    public void start() {
        System.out.println("Electric motorcycle starting");
    }

    public void stop() {
        System.out.println("Electric motorcycle stopping");
    }

    public String getInfo() {
        return "Electric Motorcycle\n"
                + "Fuel: " + fuel + "\n"
                + "Color: " + color;
    }

    public void charge() {
        System.out.println("Electric motorcycle charging");
    }
}