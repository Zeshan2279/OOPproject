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
public class RubricLevel {
    private String name;
    private int percentage;
    private int order;
    
    //getter
    public String getLevelName(){
        return name;
    }
    public int getPercentage(){
        return percentage;
    }
    public int getOrder(){
        return order;
    }
    
    //setter
    public void setLevelName(String n){
        name=n;
    }
    public void setPercentage(int per){
        percentage=per;
    }
    public void setOrder(int order){
        this.order=order;
    }
    
    
}
