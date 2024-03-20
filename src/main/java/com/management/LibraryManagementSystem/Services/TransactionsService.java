package com.management.LibraryManagementSystem.Services;

import com.management.LibraryManagementSystem.Entities.Book;
import com.management.LibraryManagementSystem.Entities.LibraryCard;
import com.management.LibraryManagementSystem.Entities.Transaction;
import com.management.LibraryManagementSystem.Enums.TransactionStatus;
import com.management.LibraryManagementSystem.Repositories.BookRepository;
import com.management.LibraryManagementSystem.Repositories.CardRepository;
import com.management.LibraryManagementSystem.Repositories.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Optional;

@Service
public class TransactionsService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private TransactionsRepository transactionsRepository;

    public static Integer MAX_NO_OF_ISSUED_BOOKS = 3;

    public String issueBook(Integer bookId , Integer cardId) throws Exception{

        //find book and card from repository

        //Create the transcation Object

        //set the relevant attributes of transactionObject

        //change the attribute the card and book entity

        //1. Book should be valid :
        Optional<Book> bookOptional = bookRepository.findById(bookId);
        if(bookOptional.isEmpty()){
            throw  new Exception("BookId entered is Incorrect");
        }

        Book book = bookOptional.get();

        //2. LibraryCard should valid
        Optional<LibraryCard> libraryCardOptional = cardRepository.findById(cardId);
        if(libraryCardOptional.isEmpty()){
            throw new Exception("CardId entered is incorrect");
        }
        LibraryCard card = libraryCardOptional.get();

        Transaction transaction = new Transaction();
        transaction.setBook(book);
        transaction.setCard(card);
        transaction.setTransactionStatus(TransactionStatus.PENDING);


        //3. book should not be already issued
        if(book.isIssued()){
            transaction.setTransactionStatus(TransactionStatus.FAILURE);
            transactionsRepository.save(transaction);
            return "Book is already issued to cardId"+ card.getCardNo();
        }

        //4. limit of the card exceeded
        if(card.getNoOfBookIssued()>MAX_NO_OF_ISSUED_BOOKS){
            transaction.setTransactionStatus(TransactionStatus.FAILURE);
            transactionsRepository.save(transaction);
            return "The limit of this card has exceeded";
        }

        //5. Check for if the card has expired its validity
        LocalDate currentDate = LocalDate.now();
        if(currentDate.isAfter(card.getValidity())){
            transaction.setTransactionStatus(TransactionStatus.FAILURE);
            transactionsRepository.save(transaction);
            return "the card is expired";
        }

        //HAPPY HAPPY HAPPY
        transaction.setTransactionStatus(TransactionStatus.SUCCESS);

        book.setIssued(true);
        card.setNoOfBookIssued(card.getNoOfBookIssued()+1);

        //rule is whatever has been modified : should be saved;
        cardRepository.save(card);
        bookRepository.save(book);
        transaction = (Transaction) transactionsRepository.save(transaction);
        return "The transaction has been completed with transactionId"+ transaction.getTransactionId();

    }

}
