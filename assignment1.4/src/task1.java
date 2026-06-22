import java.util.Random;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        String[] firstname = new String[]{"Charlie", "Bob", "Mark"};
        String[] lastname = new String[]{"Smith", "Jones", "Williams"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("How many names? ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(
                    firstname[random.nextInt(firstname.length)] + " " +
                            lastname[random.nextInt(lastname.length)]
            );
        }
    }
}
