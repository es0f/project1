import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class TemperatureAverage {
    public static void main(String[] args) {
        String fileURL = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        double sum = 0;
        int count = 0;
        try {
            URL url = new URL(fileURL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data[0].startsWith("2023-01-01")) {
                    double temperature = Double.parseDouble(data[2].replace(",", "."));
                    sum += temperature;
                    count++;
                }
            }
            reader.close();
            double average = sum / count;
            System.out.printf("Average temperature: %.2f°C%n", average);
        } catch (Exception e) {
            System.out.println("Error reading the file.");
        }
    }
}