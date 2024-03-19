package com.management.LibraryManagementSystem.Entities;

import com.management.LibraryManagementSystem.Enums.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BookId;

    @Column(unique = true)
    private String title;

    private Integer noOfPages;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private Integer Price;

    @JoinColumn
    @ManyToOne
    private Author author;
}
