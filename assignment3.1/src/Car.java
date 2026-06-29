public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private boolean cruiseControlOn;
    private double targetSpeed;
    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }
    public Car(String typeName, double gasolineLevel, double speed) {
        this.typeName = typeName;
        this.gasolineLevel = gasolineLevel;
        this.speed = speed;
    }
    public void setTargetSpeed(double speed) {
        targetSpeed = speed;
    }
    public double getTargetSpeed() {
        return targetSpeed;
    }
    public boolean turnCruiseControlOn() {
        cruiseControlOn = true;
        return true;
    }
    public void turnCruiseControlOff() {
        cruiseControlOn = false;
    }
}
