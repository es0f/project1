public class ShapeCalculator {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5, "Red"),
                new Rectangle(4, 6,"Yellow"),
                new Triangle(3, 8, "Blue")
        };

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Color: " + shape.getColor());
        }
    }
}
