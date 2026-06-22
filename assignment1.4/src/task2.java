import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int maxSum = numbers[0];
        int startIndex = 0;
        int endIndex = 0;

        for (int start = 0; start < size; start++) {
            int currentSum = 0;

            for (int end = start; end < size; end++) {
                currentSum += numbers[end];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = start;
                    endIndex = end;
                }
            }
        }
        System.out.println("\nMaximum sum: " + maxSum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));

        sc.close();
    }
}

