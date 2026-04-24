package com.example.crms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regNo;

    private String name;
    private String department;

    @Column(name = "student_year")
    private int year;

    private String dreamCompany;
    private int skillrackCount;

    @Transient
    private List<Semester> semesters = new ArrayList<>();

    @Transient
    private List<Event> events = new ArrayList<>();

    public Student() {}

    public double getCGPA() {
        if (semesters == null || semesters.isEmpty()) return 0;
        double total = 0;
        for (Semester s : semesters) total += s.getGPA();
        return total / semesters.size();
    }

    // getters & setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRegNo() { return regNo; }
    public void setRegNo(int regNo) { this.regNo = regNo; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getDreamCompany() { return dreamCompany; }
    public void setDreamCompany(String dreamCompany) { this.dreamCompany = dreamCompany; }

    public int getSkillrackCount() { return skillrackCount; }
    public void setSkillrackCount(int skillrackCount) { this.skillrackCount = skillrackCount; }

    public List<Semester> getSemesters() { return semesters; }
    public void setSemesters(List<Semester> semesters) { this.semesters = semesters; }

    public List<Event> getEvents() { return events; }
    public void setEvents(List<Event> events) { this.events = events; }
}