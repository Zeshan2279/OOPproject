package rbe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YDRGZM
 */
public class EnrolledSt extends Student {

    private List<Course> courseList;
    private List<Result> dmc;

    //getter
    public List<Course> getCourseList() {
        return courseList;
    }

    public List<Result> getDmc() {
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

    @Override
    public String getType() {
        return "Enrolled";
    }

}
