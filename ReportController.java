package com.example.crms.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.crms.model.Student;
import com.example.crms.service.GradeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ReportController {

    @Autowired
    private GradeService gradeService;

    // ✅ THIS IS YOUR MAIN API
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return gradeService.saveStudent(student);
    }

    
}