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
public class Rubric {

    private String rubName;
    private int marks;
    private int levelWeight=0;
    private List<RubricLevel> rubList=new ArrayList<RubricLevel>();

    public String getRubName() {
        return rubName;
    }

    public int getMarks() {
        return marks;
    }

    public List<RubricLevel> getRubList() {
        return rubList;
    }

    public void setRubName(String c) {
        rubName = c;
    }

    public void addRubricLevel(RubricLevel rl) {
        rubList.add(rl);
        updateLevelWeight();
    }

    public void removeRubricLevel(String levelName) {
        for (int i = 0; i < rubList.size(); i++) {
            if (rubList.get(i).getLevelName().equals(levelName)) {
                rubList.remove(i);
            }
        }
    }

    public void setRubricLevel(String levelName, RubricLevel rl) {
        for (int i = 0; i < rubList.size(); i++) {
            if (rubList.get(i).getLevelName().equals(levelName)) {
                rubList.set(i, rl);
            }
        }
    }

    public void updateLevelWeight(){
        for(int i=0; i<rubList.size() ;i++)
        {
            levelWeight+=rubList.get(i).getPercentage();
        }
    }
    public int isMoreLevelReq(){
        if(levelWeight<100){
            return 100-levelWeight;
        }
        return -1;
    }
}
