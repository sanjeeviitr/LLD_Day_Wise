package org.example.Aggregation;

public class Book {
    private String bookId;
    private String bookName;
    public Book(String id, String name){
        this.bookId = id;
        this.bookName = name;
    }

    public String getBookId(){
        return bookId;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String newName){
        this.bookName = newName;
    }
}
