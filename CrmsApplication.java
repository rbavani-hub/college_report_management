package com.example.crms;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication(scanBasePackages = "com.example.crms")
public class CrmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrmsApplication.class, args);
        System.out.println("Application running at: http://localhost:8081");
    }
}