package org.library;

import org.Book;
import org.patron.Patron;

import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books;
    private List<Patron> members;

    public Library(List<Book> books, List<Patron> members) {
        this.books = books;
        this.members = members;
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
