package com.management.LibraryManagementSystem.Entities;


import com.management.LibraryManagementSystem.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table (name = "card_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibraryCard {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int cardNo;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    private int noOfBookIssued;

    private Date validity;

    @JoinColumn // This tells that a new Column is adding the DB
    @OneToOne // Mapping
    private Student student; // connect to student (Student obj.)

}
