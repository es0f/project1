import java.util.Scanner;
public class task3  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        int[] unique = new int[size];
        int count = 0;

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (numbers[i] == unique[j]) {
                    duplicate = true;
                }
            }

            if (!duplicate) {
                unique[count] = numbers[i];
                count++;
            }
        }

        System.out.println("The array without duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}

