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
public class Result {
    private String assessmentID;
    private String courseCode;
    
    //getter
    public String getResultAssessID(){
        return assessmentID;
    }
    public String getResultCrsCode(){
        return courseCode;
    }
    //setter
    public void setResultAssesID(String id){
        assessmentID=id;
    }
    public void setResultCrsCode(String crs){
        courseCode=crs;
    }
}
