package com.example.crms.model;
 
public class Attendance {
    private String month;
    private double percentage;
 
    public Attendance() {}
 
    public Attendance(String month, double percentage) {
        this.month = month;
        this.percentage = percentage;
    }
 
    public String getMonth() { return month; }
    public void setMonth(String month) { this.month = month; }
 
    public double getPercentage() { return percentage; }
    public void setPercentage(double percentage) { this.percentage = percentage; }
}