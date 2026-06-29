public class Car implements Vehicle{
    public void start() {
        System.out.println("Car starting");
    }
    public void stop() {
        System.out.println("Car stopping");
    }
    public String getInfo(){
        return "Car Information:\n"
                + "Type: Car\n"
                + "Fuel: Petrol\n"
                + "Color: Red";
    }
}
