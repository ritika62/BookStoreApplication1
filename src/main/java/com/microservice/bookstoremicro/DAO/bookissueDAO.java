package com.microservice.bookstoremicro.DAO;

import com.microservice.bookstoremicro.Entity.bookissue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookissueDAO extends JpaRepository<bookissue,Integer>{
}
