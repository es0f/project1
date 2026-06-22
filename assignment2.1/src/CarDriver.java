public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla");

        myCar.fillTank();

        myCar.setTargetSpeed(60);

        if (myCar.turnCruiseControlOn()) {
            System.out.println("Cruise control activated");
            System.out.println("Target speed: "
                    + myCar.getTargetSpeed());
        } else {
            System.out.println("Cruise control could not be activated");
        }

        System.out.println(myCar.getTypeName()
                + ": speed is "
                + myCar.getSpeed()
                + " km/h");
    }
}