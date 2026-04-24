package com.example.crms.model; 
public class Event {
    private String type;       // Intra / Inter
    private String eventName;
    private String college;
    private String result;
 
    public Event() {}
 
    public Event(String type, String eventName, String college, String result) {
        this.type = type;
        this.eventName = eventName;
        this.college = college;
        this.result = result;
    }
 
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
 
    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }
 
    public String getCollege() { return college; }
    public void setCollege(String college) { this.college = college; }
 
    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
}