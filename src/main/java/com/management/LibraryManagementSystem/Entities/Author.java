package com.management.LibraryManagementSystem.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer authorId;

    private String name;

    private Integer age;

    private String emailId;

    private Double rating;


    private Integer noOfBooks;

}
