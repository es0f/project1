import java.util.Scanner;
public class ex2task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st leg length: ");
        double a = scanner.nextDouble();
        System.out.print("Enter 2nd leg length: ");
        double b = scanner.nextDouble();
        double c = Math.sqrt(a * a + b * b);
        System.out.printf("The hypotenuse is: %.2f\n", c);
        scanner.close();
    }
}
