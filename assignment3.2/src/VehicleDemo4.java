public class VehicleDemo4 {

    public static void main(String[] args) {

        Car2 car = new Car2();
        Bus2 bus = new Bus2();
        ElectricCar electricCar = new ElectricCar();

        System.out.println(car.getInfo());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency());

        System.out.println();
        System.out.println(bus.getInfo());
        System.out.println("Fuel Efficiency: " + bus.calculateFuelEfficiency());
        System.out.println();
        System.out.println(electricCar.getInfo());
        System.out.println("Fuel Efficiency: " + electricCar.calculateFuelEfficiency());
    }
}