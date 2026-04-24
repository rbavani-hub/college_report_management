package com.example.crms.model; 
import java.util.List;
import java.util.ArrayList;
 
public class Semester {
    private int semNo;
    private String tutorName;
    private List<Course> courses = new ArrayList<>();
    private List<Attendance> attendanceList = new ArrayList<>();
 
    public Semester() {}
 
    public Semester(int semNo, String tutorName) {
        this.semNo = semNo;
        this.tutorName = tutorName;
    }
 
    public double getGPA() {
        if (courses == null || courses.isEmpty()) return 0;
        double total = 0;
        for (Course c : courses) total += c.getMarks();
        return (total / courses.size()) / 10.0;
    }
 
    public int getSemNo() { return semNo; }
    public void setSemNo(int semNo) { this.semNo = semNo; }
 
    public String getTutorName() { return tutorName; }
    public void setTutorName(String tutorName) { this.tutorName = tutorName; }
 
    public List<Course> getCourses() { return courses; }
    public void setCourses(List<Course> courses) { this.courses = courses; }
 
    public List<Attendance> getAttendanceList() { return attendanceList; }
    public void setAttendanceList(List<Attendance> attendanceList) { this.attendanceList = attendanceList; }
}