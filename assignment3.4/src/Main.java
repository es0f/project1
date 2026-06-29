import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "Alice", 20);
        Course course = new Course("CS101", "Java Programming", "John Smith");
        Enrollment enrollment = new Enrollment(student, course, "2026-06-30");

        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("enrollments.ser"));
            out.writeObject(enrollment);
            out.close();
            System.out.println("Enrollment saved.");
        } catch (Exception e) {
            System.out.println("Error saving enrollment.");
        }

        try {
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("enrollments.ser"));
            Enrollment loaded = (Enrollment) in.readObject();
            in.close();
            System.out.println("\nEnrollment information");
            System.out.println("----------------------");
            System.out.println("Student ID: " + loaded.getStudent().getId());
            System.out.println("Student Name: " + loaded.getStudent().getName());
            System.out.println("Age: " + loaded.getStudent().getAge());
            System.out.println("Course Code: " + loaded.getCourse().getCourseCode());
            System.out.println("Course Name: " + loaded.getCourse().getCourseName());
            System.out.println("Instructor: " + loaded.getCourse().getInstructor());
            System.out.println("Enrollment Date: " + loaded.getEnrollmentDate());
        } catch (Exception e) {
            System.out.println("Error loading enrollment.");
        }
    }
}