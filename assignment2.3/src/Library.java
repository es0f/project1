import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println((i + 1) +
                    ". Title: \"" + b.getTitle() +
                    "\", Author: \"" + b.getAuthor() +
                    "\", Year: " + b.getYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                System.out.println("Title: \"" +
                        b.getTitle() +
                        "\", Year: " +
                        b.getYear());
            }
        }
    }
    public void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
                System.out.println(title + " borrowed.");
                return;
            }
        }
    }

    public void returnBook(Book book) {
        books.add(book);
    }

    public boolean isBookAvailable(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
    public double getAverageBookRating() {
        double total = 0;
        for (Book b : books) {
            total += b.getRating();
        }
        return total / books.size();
    }
    public Book getMostReviewedBook() {
        Book mostReviewed = null;
        int maxReviews = 0;
        for (Book b : books) {
            if (b.getReviews().size() > maxReviews) {
                maxReviews = b.getReviews().size();
                mostReviewed = b;
            }
        }
        return mostReviewed;
    }
}