package com.example.crms.service;
 
import com.example.crms.model.Student;
import org.springframework.stereotype.Service;
 
@Service
public class RemarkService {
 
    public String generate(Student s) {
        StringBuilder remark = new StringBuilder();
 
        // Academic Remark
        if (s.getCGPA() >= 8.0)
            remark.append("✅ Good Academics. ");
        else if (s.getCGPA() >= 6.0)
            remark.append("⚠️ Average Academics - Needs Improvement. ");
        else
            remark.append("❌ Poor Academics - Must Improve Urgently. ");
 
        // Skillrack Remark
        if (s.getSkillrackCount() > 200)
            remark.append("💻 Strong Coding Skills. ");
        else if (s.getSkillrackCount() > 100)
            remark.append("💡 Moderate Coding - Practice More. ");
        else
            remark.append("🔴 Low Skillrack Count - Practice Daily. ");
 
        // Placement Remark
        String dc = s.getDreamCompany();
        if (dc == null || dc.isBlank() || dc.equalsIgnoreCase("Not Specified"))
            remark.append("🏢 Eligible for TCS / Infosys / Wipro.");
        else
            remark.append("🎯 Target Company: ").append(dc).append(".");
 
        return remark.toString();
    }
}
 