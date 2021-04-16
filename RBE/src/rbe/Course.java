/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YDRGZM
 */
public class Course {
    private String courseCode;
    private String courseName;
    private String semester;
//    private int creditHour;
    private List<CLOs> cloList;
    private List<Assessment> assessmentList;

    public Course() {
        cloList=new ArrayList<CLOs>();
        assessmentList=new ArrayList<Assessment>();
    }
    
    
    //getter
    public String getCrsCode(){
        return courseCode;
    }
    public String getCrsName(){
        return courseName;
    }
    public String getSemester(){
        return semester;
    }
    public List<CLOs> getCloList(){
        return cloList;
    }
    public List<Assessment> getAssessmentList(){
        return assessmentList;
    }
    
    //setter
    public void setCrsCode(String code){
        courseCode=code;
    }
    public void setCrsName(String n){
        courseName=n;
    }
    public void setSemester(String sem){
        semester=sem;
    }
    //clo management 
    public void addClo(CLOs c){
        cloList.add(c);
    }
    public void deleteClo(CLOs c){
        cloList.remove(c);
    }
    //assessment management 
    public void addAssessment(Assessment a){
        assessmentList.add(a);
    }
    public void deleteAssessment(Assessment a){
        assessmentList.remove(a);
    }
    
}
