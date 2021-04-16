/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbe;

import java.util.List;

/**
 *
 * @author YDRGZM
 */
public class Assessment {
    private String name;
    private String Id;
    private int marks;
    private List<Question> qList;
    
    //getter 
    public String getAssessName(){
        return name;
    }
    public String getAssessID(){
        return Id;
    }
    public int getTotalMarks(){
        return marks;
    }
    public List<Question> getQList(){
        return qList;
    }
    //setter
    public void setAssessName(String n){
        name=n;
    }
    public void setAssessID(String i){
        Id=i;
    }
    public void setTotalMarks(int marks){
        this.marks=marks;
    }
    public void addQuestion(Question q){
        qList.add(q);
    }
}
