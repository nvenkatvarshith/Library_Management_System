package org.patron;

import org.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Patron {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private List<Book> borrowedBooks;

    public Patron(String name, String phoneNumber, String address, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void addBorrowedBook(Book borrowedBooks){
        this.borrowedBooks.add(borrowedBooks);
    }

    public void returnBook(Book returnBook){
        borrowedBooks.removeIf(book -> returnBook.getIsbn().equals(book.getIsbn()));
    }
}
