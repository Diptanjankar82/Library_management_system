package com.management.LibraryManagementSystem.Controller;


import com.management.LibraryManagementSystem.Entities.Author;
import com.management.LibraryManagementSystem.Entities.Book;
import com.management.LibraryManagementSystem.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("add")
    public String addAuthor(@RequestBody Author author){
        String result = authorService.addAuthor(author);
        return result;
    }
    @GetMapping("/getAuthorWithMaxBook")
    public Author getAuthor(){
        Author ansAuthor = authorService.getAuthorWithMaxBooks();
        return ansAuthor;
    }


}
