package com.example.crms.service;

import com.example.crms.model.Student;

public interface GradeService {

    Student saveStudent(Student student);

    double calculateCGPA(Student student);

    String getGrade(double cgpa);

    String getRemark(double cgpa);
}