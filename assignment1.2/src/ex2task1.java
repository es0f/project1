import java.util.Scanner;
public class ex2task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temp in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Temp in Celsius is: %.1f\n", celsius);
        scanner.close();
    }
}
