package org.library;

import org.Book;
import org.patron.Patron;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books;
    private List<Patron> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(String bookIsbn){
        books.removeIf(book -> book.getIsbn().equals(bookIsbn));
    }

    public void addPatron(Patron patron){
        members.add(patron);
    }

    public void removePatron(String bookIsbn){
        books.removeIf(book -> book.getIsbn().equals(bookIsbn));
    }

    public void displayAllDetails(){
        for(Book book:books){
            System.out.println(book);
        }
        for(Patron member:members){
            System.out.println(member);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Patron> getMembers() {
        return members;
    }

    public void setMembers(List<Patron> members) {
        this.members = members;
    }
}
