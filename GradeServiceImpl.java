package com.example.crms.service;

import org.springframework.stereotype.Service;
import com.example.crms.model.Student;
import com.example.crms.model.Semester;
import com.example.crms.model.Course;

@Service
public class GradeServiceImpl implements GradeService {

    @Override
    public Student saveStudent(Student student) {
        return student; // for now just return
    }

    @Override
    public double calculateCGPA(Student student) {
        double total = 0;
        int count = 0;

        for (Semester sem : student.getSemesters()) {
            for (Course c : sem.getCourses()) {
                total += c.getMarks();
                count++;
            }
        }

        return count == 0 ? 0 : (total / count) / 10;
    }

    @Override
    public String getGrade(double cgpa) {
        if (cgpa >= 9) return "O";
        else if (cgpa >= 8) return "A";
        else if (cgpa >= 7) return "B";
        else if (cgpa >= 6) return "C";
        else return "F";
    }

    @Override
    public String getRemark(double cgpa) {
        if (cgpa >= 9) return "Excellent Performance!";
        else if (cgpa >= 8) return "Very Good!";
        else if (cgpa >= 7) return "Good";
        else if (cgpa >= 6) return "Average - Improve more";
        else return "Poor Performance";
    }
}