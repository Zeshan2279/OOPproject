/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author YDRGZM
 */
public class Student extends Person {

    private Date dob;
    private String regNo;
    private String semester;
    private List<Course> courseList;
    private List<Result> dmc;

    //getters
    /**
     * Returns date of birth
     *
     * @return dob
     */
    public Date getDOB() {
        return dob;
    }

    /**
     * Returns registration number of student
     *
     * @return regNo
     */
    public String getRegNo() {
        return regNo;
    }

    public String getSemester() {
        return semester;
    }

    //setters
    public void setDob(Date d) {
        dob = d;
    }

    public void setRegNo(String r) {
        regNo = r;
    }

    public void setSem(String s) {
        semester = s;
    }

    public List<Course> getCourseList() {
        if (courseList == null) {
            courseList = new ArrayList<Course>();
        }
        return courseList;
    }

    public List<Result> getDmc() {
        if (dmc == null) {
            dmc = new ArrayList<Result>();
        }
        return dmc;
    }

    //methods
    public void registerCrs(Course c) {
        courseList.add(c);
    }

    public void unRegisterCrs(Course c) {

        courseList.remove(c);
    }

    public void addResult(Result r) {
        dmc.add(r);
    }

    public boolean updateResult(String a, Result r) {
        for (int i = 0; i < dmc.size(); i++) {
            if (dmc.get(i).getResultAssessID().equals(a)) {
                dmc.set(i, r);
                return true;
            }
        }
        return false;
    }

    public Course searchCrs(String crsCode) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCrsCode().equals(crsCode)) {
                return courseList.get(i);
            }
        }
        return null;
    }

    public List<Course> searchBySem(String sem) {
        List<Course> li = new ArrayList<Course>();
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getSemester().equals(sem)) {
                li.add(courseList.get(i));
            }
        }
        return li;
    }

    /**
     * Gives the type of person
     *
     * @return "Student"
     */
    @Override
    public String getType() {
        return "Student";
    }

}
