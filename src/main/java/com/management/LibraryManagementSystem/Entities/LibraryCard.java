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

    private CardStatus cardStatus;

    private int noOfBookIssued;

    private Date validity;

}
