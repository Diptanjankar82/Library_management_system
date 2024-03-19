package com.management.LibraryManagementSystem.Services;

import com.management.LibraryManagementSystem.Entities.Author;
import com.management.LibraryManagementSystem.Entities.Book;
import com.management.LibraryManagementSystem.Exceptions.InvalidPageCountException;
import com.management.LibraryManagementSystem.Repositories.AuthorRepository;
import com.management.LibraryManagementSystem.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;
    public String addBook(Book book)throws Exception{

        if(book.getNoOfPages()<=0){
            throw new InvalidPageCountException("Page count entered is incorrect");

        }
      bookRepository.save(book);
      return "Book has benn saved to DB";
    }

    public String associateBookAndAuthor(Integer bookId, Integer authorId){
        Book book = bookRepository.findById(bookId).get();
        Author author = authorRepository.findById(authorId).get();

        //associate book and author Entity
        book.setAuthor(author);


        author.setNoOfBooks(author.getNoOfBooks()+1);
        bookRepository.save(book);
        authorRepository.save(author);
        return "Book and Author have been associated";
    }
    public List<Book> findBooksByAuthor(Integer authorId){

        List<Book> allBooks = bookRepository.findAll();

        //I need to Iterate where:
        //Book.getAuthor.getID is matching

        List<Book> ansList = new ArrayList<>();

        for(Book book : allBooks){
            if(book.getAuthor().getAuthorId().equals(authorId)){
                ansList.add(book);
            }
        }
        return ansList;
    }
}
