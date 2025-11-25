package com.bookstore.bookstoreAPI.Services;

import com.bookstore.bookstoreAPI.Entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Book saveBook(Book book);

    Book updateBook(Book book);

    List<Book> getBooks();

    Optional<Book> getBookById(Long id);

    void deleteBook(Long id);
}
