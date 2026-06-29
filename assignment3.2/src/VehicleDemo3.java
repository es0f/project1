public class VehicleDemo3 {

    public static void main(String[] args) {

        Car2 car = new Car2();
        ElectricCar electricCar = new ElectricCar();
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle();
        car.start();
        car.charge();

        System.out.println(car.getInfo());
        System.out.println();
        electricCar.start();
        electricCar.charge();
        System.out.println(electricCar.getInfo());
        System.out.println();
        electricMotorcycle.start();
        electricMotorcycle.charge();
        System.out.println(electricMotorcycle.getInfo());
    }
}