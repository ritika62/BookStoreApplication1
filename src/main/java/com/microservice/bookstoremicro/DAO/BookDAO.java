package com.microservice.bookstoremicro.DAO;

import com.microservice.bookstoremicro.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDAO extends JpaRepository<Book,Integer> {
}
