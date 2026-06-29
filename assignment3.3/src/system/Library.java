package system;

import model.Book;
import model.LibraryMember;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added.");
    }
    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println(member.getName() + " joined the library.");
    }
    public void borrowBook(LibraryMember member, Book book) {

        if (books.contains(book)) {
            member.borrowBook(book);
            books.remove(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }
    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            books.add(book);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Member doesn't have this book.");
        }
    }
    public void reserveBook(LibraryMember member, Book book) {

        if (!book.isReserved()) {

            book.setReserved(true);
            member.addReservedBook(book);

            System.out.println(member.getName() + " reserved " + book.getTitle());

        } else {

            System.out.println("Book is already reserved.");

        }

    }
    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation cancelled.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }

    }
    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books:");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }

    }
}