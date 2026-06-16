import java.util.Scanner;
public class ex2task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight (g): ");
        double grams = scanner.nextDouble();
        double totalLuoti = grams / 13.28;
        int leiviska = (int) (totalLuoti / (20 * 32));
        double remainingPostLeiviska = totalLuoti % (20 * 32);
        int naula = (int) (remainingPostLeiviska / 32);
        double luoti = remainingPostLeiviska % 32;
        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.\n", grams, leiviska, naula, luoti);
        scanner.close();
    }
}
