/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbe;

import java.util.Date;

/**
 *
 * @author YDRGZM
 */
public class Student extends Person{
    private Date dob;
    private String regNo;
    
    //getters
    
    /**
     * Returns date of birth
     * @return dob
     */
    public Date getDOB(){
        return dob;
    }
    /**
     * Returns registration number of student
     * @return regNo
     */
    public String getRegNo(){
        return regNo;
    }
    
    //setters
    public void setDob(Date d){
        dob=d;
    }
    public void setRegNo(String r){
        regNo=r;
    }
    
    /**
     * Gives the type of person
     * @return "Student"
     */
    @Override
    public String getType(){
        return "Student";
    }
    
}
