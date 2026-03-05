package org;

import org.patron.Patron;

import java.util.List;

public class Checkout {
    private String orderId;
    private Patron patron;
    private List<Book> books;

    public Checkout(String orderId, Patron patron, List<Book> books) {
        this.orderId = orderId;
        this.patron = patron;
        this.books = books;
    }

    public void borrowBooks(List<Book> books){
        for(Book book:books){
            patron.addBorrowedBook(book);
            book.setIsAvailable(false);
        }
    }

    public void returnBooks(List<Book> books){
        for(Book book:books){
            patron.returnBook(book);
            book.setIsAvailable(true);
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
