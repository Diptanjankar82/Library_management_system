package com.management.LibraryManagementSystem.Repositories;

import com.management.LibraryManagementSystem.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

}
