package com.example.crms.dto;
import com.example.crms.model.Student; 
public class ReportResponse {
    private Student student;
    private double cgpa;
    private String grade;
    private String remark;
 
    public ReportResponse() {}
 
    public ReportResponse(Student student, double cgpa, String grade, String remark) {
        this.student = student;
        this.cgpa = cgpa;
        this.grade = grade;
        this.remark = remark;
    }
 
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
 
    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }
 
    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
 
    public String getRemark() { return remark; }
    public void setRemark(String remark) { this.remark = remark; }
}
 