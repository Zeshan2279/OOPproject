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
public class CLOs {
    private String cloName;
    private String description;
    private List<Rubric> rubricList;

    public CLOs() {
        if(rubricList==null){
            rubricList=new ArrayList<Rubric>();
        }
    }
    
    
    //getter
    public String getCloName(){
        return cloName;
    }
    public String getCloDescrip(){
        return description;
    }
    public List<Rubric> getRubricList(){
        return rubricList;
    }
    //setters
    public void setCloName(String cn){
        cloName=cn;
    }
    public void setCloDescrip(String des){
        description=des;
    }
    public void addRubric(Rubric r){
        rubricList.add(r);
    }
    
    
}
