public class Bus implements Vehicle {
    public void start() {
        System.out.println("Bus starting");
    }

    public void stop() {
        System.out.println("Bus stopping");
    }

    public String getInfo() {
        return "Bus Information:\n"
                + "Type: Bus\n"
                + "Fuel: Diesel\n"
                + "Capacity: 40 passengers";
    }
}
