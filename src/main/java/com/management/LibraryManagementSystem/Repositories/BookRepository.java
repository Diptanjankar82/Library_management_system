package com.management.LibraryManagementSystem.Repositories;

import com.management.LibraryManagementSystem.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
