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
public class Person {
    private String name;
    private String fatherName;
    private String email;
    private String password;
    
    //getters
    public String getName(){
        return name;
    }
    public String getFatherName(){
        return fatherName;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    
    //setters
    public void setName(String n){
        name=n;
    }
    public void setFatherName(String f){
        fatherName=f;
    }
    public void setEmail(String mail){
        email=mail;
    }
    public void setPassword(String pwd){
        password=pwd;
    }
    //getType method
    public String getType(){
        return "Person";
    }
}
