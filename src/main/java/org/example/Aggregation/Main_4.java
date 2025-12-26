package org.example.Aggregation;

public class Main_4 {

    public static void main(String[] args) {
        Library l1 = new Library();
        Book b1 = new Book("123", "Harry potter");
        Book b2 = new Book("124", "Light");
        l1.addBook(b1);
        l1.addBook(b2);
        l1.showAllBooks();
        l1.removeBook("124");
        l1.showAllBooks();
        Book a = l1.getBookById("124");
        if (a != null) System.out.println(a.getBookName());
        Book b = l1.getBookById("123");
        if (b != null) System.out.println(b.getBookName());
        l1.updateBook("123", "new light");
        System.out.println(b1.getBookName());
    }
}
