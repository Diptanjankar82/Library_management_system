package com.management.LibraryManagementSystem.Repositories;

import com.management.LibraryManagementSystem.Entities.Book;
import com.management.LibraryManagementSystem.Entities.LibraryCard;
import com.management.LibraryManagementSystem.Entities.Transaction;
import com.management.LibraryManagementSystem.Enums.TransactionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transaction,String> {
    Transaction findTransactionByBookAndCardAndTransactionStatus(Book book, LibraryCard card, TransactionStatus transactionStatus);


}
