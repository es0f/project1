import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSV {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("fibonacci.csv");
            long first = 0;
            long second = 1;
            for (int i = 0; i < 60; i++) {
                writer.write(first + "\n");
                long next = first + second;
                first = second;
                second = next;
            }
            writer.close();
            System.out.println("Fibonacci sequence saved to fibonacci.csv");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}