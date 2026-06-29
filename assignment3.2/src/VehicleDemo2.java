public class VehicleDemo2 {
    public static void main(String[] args) {

        Car2 car = new Car2();
        Motorcycle2 motorcycle = new Motorcycle2();
        Bus2 bus = new Bus2();

        System.out.println("Vehicle Demonstration\n");
        car.start();
        car.honk();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println();
        motorcycle.start();
        motorcycle.honk();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println();
        bus.start();
        bus.honk();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}
