package com.management.LibraryManagementSystem.Controller;


import com.management.LibraryManagementSystem.Entities.Student;
import com.management.LibraryManagementSystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // here we wrote API endPoint
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/add")

    public String addStudent(@RequestBody Student student){
        String result = studentService.addStudent(student);
        return result;
    }

}
