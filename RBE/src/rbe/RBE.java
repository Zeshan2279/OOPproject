package rbe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YDRGZM
 */
public class RBE {

    private static RBE r;
    private RBE(){
        personList=new ArrayList<Person>();
    }
    public static RBE getInstance(){
        if(r==null){
           r=new RBE();
           
        }
        return r;
    }
    private List<Person> personList;
    
    public List<Person> getPersonList(){
        return personList;
    }
    
    public void addtoList(Person p){
        personList.add(p);
    }
    public void setAtIndList(int i,Person p){
        personList.set(i,p);
    }
    public List<Student> getStdList(){
        List<Student> stList= new ArrayList<Student>();
        
        for(int i=0; i< personList.size();i++)
        {
            if(personList.get(i).getType().equals("Student")){
                Student std=(Student) personList.get(i);
                stList.add(std);
            }
        }
        
        return stList;
    }
    public List<Teacher> getTList(){
        List<Teacher> tList= new ArrayList<Teacher>();
        
        for(int i=0; i< personList.size();i++)
        {
            if(personList.get(i).getType().equals("Teacher")){
                Teacher std=(Teacher) personList.get(i);
                tList.add(std);
            }
        }
        
        return tList;
    }
    
    public int searchPersonAccount(String uName, String uPwd){
        for(int i=0; i<personList.size() ;i++)
        {
            if((personList.get(i).getName().equals(uName))&&personList.get(i).getPassword().equals(uPwd)){
                return i;
            }
        }
        return -1;
    }
    
    //main
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

}
