public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(
                "Introduction to Java Programming",
                "John Smith",
                2020);
        Book b2 = new Book(
                "Data Structures and Algorithms",
                "Jane Doe",
                2018);
        Book b3 = new Book(
                "The Art of Fiction",
                "Alice Johnson",
                2019);
        b1.setRating(4.5);
        b2.setRating(5.0);
        b3.setRating(4.0);
        b1.addReview("Great book");
        b1.addReview("Very helpful");
        b2.addReview("Excellent");
        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.displayBooks();
        library.findBooksByAuthor("Jane Doe");
        System.out.println("\nAvailable: "
                + library.isBookAvailable(
                "The Art of Fiction"));
        System.out.println("\nAverage rating: "
                + library.getAverageBookRating());
        Book mostReviewed =
                library.getMostReviewedBook();
        System.out.println(
                "Most reviewed book: "
                        + mostReviewed.getTitle());
    }
}