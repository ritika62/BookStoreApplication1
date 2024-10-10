package com.microservice.bookstoremicro.Service;

import com.microservice.bookstoremicro.DAO.BookDAO;
import com.microservice.bookstoremicro.DAO.bookissueDAO;
import com.microservice.bookstoremicro.Entity.Book;
import com.microservice.bookstoremicro.Entity.bookissue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookDAO bookDAO;

    @Autowired
    bookissueDAO bookissuedao;

    @Override
    public List<Book> getAllBooks() {
        System.out.println("--BookServiceImpl-----getAllBooks()-----");
        return bookDAO.findAll();
    }

    @Override
    public Book getBookById(Integer bid) {
        System.out.println("--BookServiceImpl-----getBookById()-----");
        return bookDAO.findById(bid).get();
    }

    @Override
    public void addBook(Book book) {
        System.out.println("--BookServiceImpl-----addBook()-----");
        bookDAO.save(book);
    }

    @Override
    public void updateBook(Book book) {
        System.out.println("--BookServiceImpl-----updateBook()-----");
        bookDAO.saveAndFlush(book);
    }

    @Override
    public void deleteBook(Integer bid) {
        System.out.println("--BookServiceImpl-----deleteBook()-----");
        bookDAO.deleteById(bid);
    }

    @Override
    public List<bookissue> getBookissuedetails(Integer bookid) {
        return bookissuedao.findAll();
    }

}
