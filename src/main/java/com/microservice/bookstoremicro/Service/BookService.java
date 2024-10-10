package com.microservice.bookstoremicro.Service;

import com.microservice.bookstoremicro.Entity.Book;
import com.microservice.bookstoremicro.Entity.bookissue;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();
    public Book getBookById(Integer bid);
    public void  addBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(Integer bid);
    public List<bookissue> getBookissuedetails(Integer bookid);
}