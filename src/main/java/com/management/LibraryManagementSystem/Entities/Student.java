package com.management.LibraryManagementSystem.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //This is the Schema of how student table will look like
@Table (name = "Student_info")
@Getter
@Setter
@NoArgsConstructor // this is like a default constructor
@AllArgsConstructor //This is like a constructor having all the argument
public class Student {
    @Id //now this attribute act as a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this is autoincrement the roolno;
    private int rollId;

    private String name;

    private Integer branch;

    private String cgpa;

    private String emailId;

}