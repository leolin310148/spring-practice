package org.noteverything.practice;

/**
 * Created by leolin on 2014/1/4.
 */
public class Book implements HasBookName {

    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
