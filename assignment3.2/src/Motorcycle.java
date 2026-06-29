public class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle starting");
    }
    public void stop(){
        System.out.println("Motorcycle stopping");
    }
    public String getInfo() {
        return "Motorcycle Information:\n"
                + "Type: Motorcycle\n"
                + "Fuel: Gasoline\n"
                + "Color: Black";
    }
}
