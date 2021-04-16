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
public class Rubric {

    private String criteria;
    private int marks;
    private List<RubricLevel> rubList;

    public String getCriteria() {
        return criteria;
    }

    public int getMarks() {
        return marks;
    }

    public List<RubricLevel> getRubList() {
        return rubList;
    }

    public void setCriteria(String c) {
        criteria = c;
    }

    public void addRubricLevel(RubricLevel rl) {
        rubList.add(rl);
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

}
