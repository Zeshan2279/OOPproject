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
public class Question {
    private int qNumber;
    private int qMarks;
    private String description;
    private RubricLevel rubLevelForQuestion;
    
    //getter
    public int getQNo(){
        return qNumber;
    }
    public int getQMarks(){
        return qMarks;
    }
    public String getQDescrip(){
        return description;
    }
    public RubricLevel getQRubLevel(){
        return rubLevelForQuestion;
    }
    //setter
    public void setQNo(int n){
        qNumber=n;
    }
    public void setQMarks(int m){
        qMarks=m;
    }
    public void setQDescrip(String des){
        description=des;
    }
    public void setQRubLevel(RubricLevel rl){
        rubLevelForQuestion=rl;
    }
    
}
