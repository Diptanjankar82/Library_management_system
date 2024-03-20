package com.management.LibraryManagementSystem.Entities;

import com.management.LibraryManagementSystem.Enums.TransactionStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table (name = "Transactions")
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String transactionId;

    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;

    @CreatedDate
    private Date issueDate;

    private Date returnDate;

    private Integer fineAmount;

    //here a new Column added with transcation table name card
    @JoinColumn
    @ManyToOne
    private LibraryCard card;

    //Here a new column added with transcation table named book
    @JoinColumn
    @ManyToOne
    private Book book;


}
