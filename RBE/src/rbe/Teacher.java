/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbe;

/**
 *
 * @author YDRGZM
 */
public class Teacher extends Person{
    private String contactPhone;
    
    //getter
    public String getContPhone(){
        return contactPhone;
    }
    //setter
    public void setContPhone(String p){
        contactPhone=p;
    }

    @Override
    public String getType() {
        return "Teacher"; 
    }
    
}

