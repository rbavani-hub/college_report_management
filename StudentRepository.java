package com.example.crms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crms.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}