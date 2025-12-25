package org.example.Aggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<Book> books;
    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(String bookId){
        boolean isRemoved = books.removeIf(book -> book.getBookId().equals(bookId));
        if(isRemoved)  System.out.println("Removed book from library " + bookId);
    }

    public void showAllBooks(){
        for(int i =0; i< books.size(); i++){
            System.out.println("Book present in library : " + books.get(i).getBookName());
        }
    }

    public Book getBookById(String bookId){
        for(Book book : books){
            if(book.getBookId().equals(bookId)){
               return book;
            }
        }
        return null;
    }

    public boolean updateBook(String id, String newName){
        for(Book book : books){
            if(book.getBookId().equals(id)){
                book.setBookName(newName);
                return true;
            }
        }
        return false;
    }



}
