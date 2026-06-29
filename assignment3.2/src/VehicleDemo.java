public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

        System.out.println("Vehicle Demonstration\n");

        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println();

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}
