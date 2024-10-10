package com.microservice.bookstoremicro.Controller;

import com.microservice.bookstoremicro.Entity.Book;
import com.microservice.bookstoremicro.Entity.bookissue;
import com.microservice.bookstoremicro.Service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Tag(name="BookController" ,description = "To perform operation on BooksStore")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    @Operation(
            summary = "Give All Books",
            description = "getAllBooks "
    )
    public List<Book> showBooksList() {
        System.out.println("------BookController--showBooksList()-----------");
    return bookService.getAllBooks();
    }


    @GetMapping("/books/{bookid}")
    @Operation(
        summary = "Give All Books By Id ",
        description = "getBookById"
    )
    public Book viewBook(@RequestBody Integer bookId) {
    System.out.println("------BookController--ViewBook()------");
    return bookService.getBookById(bookId);

    }

    @PostMapping("/addbook")
    @Operation(
            summary = "Add Books",
            description = "addBook"
    )
    public void addBook(@RequestBody Book book){
        System.out.println("------BookController--AddBook()-------");
      bookService.addBook(book);
    }


    @PutMapping("/updatebook")
    @Operation(
            summary = "UpdateBook",
            description = "updateBook"
    )
    public void saveUpdateBook(@RequestBody Book book){
        System.out.println("-----BookController---saveUpdateBook()-------");
        bookService.updateBook(book);
    }


    @DeleteMapping("/deletebook/{id}")
    @Operation(
            summary = "DeleteBook By Id",
            description = "deleteBook"
    )
    public void deleteBook(@PathVariable Integer bookId){
        System.out.println("-----BookController--deleteBook()-----");
        bookService.deleteBook(bookId);
    }
    @GetMapping("/bookissue")
    @Operation(
            summary = "Give All bookissue Details",
            description = "getBookissuedetails"
    )
    public List<bookissue> getBookissuedetails(Integer bookid) {
       return  bookService.getBookissuedetails(bookid);
    }
}
