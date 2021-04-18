package rbe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YDRGZM
 */
public class RBE {

    //main
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Loading m = new Loading();
        m.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10);
                m.progress.setText(i + "%");
                m.jProgressBar1.setValue(i);

            }

            m.setVisible(false);
            MainFrame mf = new MainFrame();
            mf.setVisible(true);
        } catch (Exception e) {

        }
    }
    private static RBE r;

    private RBE() {
        personList = new ArrayList<Person>();
        crsList = new ArrayList<Course>();
    }

    public static RBE getInstance() {
        if (r == null) {
            r = new RBE();
        }
        return r;
    }
    private List<Person> personList;
    private List<Course> crsList;

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Course> getCrsList() {
        return crsList;
    }

    public List<Course> getStdCrsList(int ind) {
        Student s = (Student) personList.get(ind);
        return s.getCourseList();
    }

    public void addtoList(Person p) {
        personList.add(p);
    }

    public void addtoCrsList(Course p) {
        crsList.add(p);
    }

    public void addStdCrsList(Course p, int ind) {
        Student s = (Student) personList.get(ind);
        s.registerCrs(p);
    }

    public void setAtIndList(int i, Person p) {
        personList.set(i, p);
    }

    public List<Student> getStdList() {
        List<Student> stList = new ArrayList<Student>();

        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getType().equals("Student")) {
                Student std = (Student) personList.get(i);
                stList.add(std);
            }
        }

        return stList;
    }

    public List<Teacher> getTList() {
        List<Teacher> tList = new ArrayList<Teacher>();

        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getType().equals("Teacher")) {
                Teacher std = (Teacher) personList.get(i);
                tList.add(std);
            }
        }

        return tList;
    }

    public int searchPersonAccount(String uName, String uPwd) {
        for (int i = 0; i < personList.size(); i++) {
            if ((personList.get(i).getName().equals(uName)) && personList.get(i).getPassword().equals(uPwd)) {
                return i;
            }
        }
        return -1;
    }

    public List<Course> searchCrsBySem(String sem) {
        List<Course> l = new ArrayList<Course>();
        for (int i = 0; i < crsList.size(); i++) {
            if (crsList.get(i).getSemester().equals(sem)) {
                l.add(crsList.get(i));
            }
        }
        return l;
    }

    public int searchCrsByCrsCode(String code) {
        for (int i = 0; i < crsList.size(); i++) {
            if (crsList.get(i).getCrsCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public List<CLOs> searchCloByCrs(String code) {
        List<CLOs> l = new ArrayList<CLOs>();
        for (int i = 0; i < crsList.size(); i++) {
            if (crsList.get(i).getCrsCode().equals(code)) {
                return crsList.get(i).getCloList();
            }
        }
        return null;
    }

    public CLOs searchCloByCloNameStr(String cn) {
        for (int i = 0; i < crsList.size(); i++) {
            for (int j = 0; j < crsList.get(i).getCloList().size(); j++) {
                if (crsList.get(i).getCloList().get(j).getCloName().equals(cn)) {
                    return crsList.get(i).getCloList().get(j);
                }
            }
        }
        return null;
    }
    public int searchCloByCloNameInt(String cn) {
        for (int i = 0; i < crsList.size(); i++) {
            for (int j = 0; j < crsList.get(i).getCloList().size(); j++) {
                if (crsList.get(i).getCloList().get(j).getCloName().equals(cn)) {
                    return j;
                }
            }
        }
        return -1;
    }
    public void addRub(Rubric r){
    }
}
