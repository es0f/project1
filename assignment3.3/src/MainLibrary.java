import model.Book;
import model.LibraryMember;
import system.Library;

public class MainLibrary {

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "111");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "222");
        LibraryMember member1 = new LibraryMember("Alice", 1);
        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);

        library.borrowBook(member1, book1);

        library.returnBook(member1, book1);

        library.reserveBook(member1, book2);

        library.displayReservedBooks(member1);

        library.cancelReservation(member1, book2);

        library.displayReservedBooks(member1);
    }
}