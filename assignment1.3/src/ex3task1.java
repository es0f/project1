import java.util.Scanner;
public class ex3task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        int choice;
        if (d < 0) {
            choice = 0;
        } else if (d == 0) {
            choice = 1;
        } else {
            choice = 2;
        }
        switch (choice) {
            case 0:
                System.out.println("No real roots");
                break;
            case 1:
                System.out.println("Root = " + (-b / (2 * a)));
                break;
            case 2:
                System.out.println("Root 1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
                System.out.println("Root 2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
                break;
        }
        sc.close();
    }
}
