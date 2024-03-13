package com.management.LibraryManagementSystem.Services;

import com.management.LibraryManagementSystem.Entities.Student;
import com.management.LibraryManagementSystem.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public String addStudent(Student student){
        studentRepository.save(student);
          return "Student has been saved to thr DB";
    }
}
