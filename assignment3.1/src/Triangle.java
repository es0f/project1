public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle (double base, double height,String color) {
    super(color);
    this.base = base;
    this.height = height;
    }

    @Override
    public double calculateArea(){
    return (height*base)/2;
    }
}
