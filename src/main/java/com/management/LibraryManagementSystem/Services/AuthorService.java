package com.management.LibraryManagementSystem.Services;

import com.management.LibraryManagementSystem.Entities.Author;
import com.management.LibraryManagementSystem.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    public String addAuthor(Author author){

        author.setNoOfBooks(0); //Setting the default value as 0 and not NULL;
         authorRepository.save(author);
         return "Author has been saved to the DB";
    }
}
