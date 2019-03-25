package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student  {

    List<Lab> labs;

    public Student() {
       // List<Lab> newLab = new ArrayList<Lab>();

        this(null);

    }

    public Student(List<Lab> labs) {
        if(labs == null){
            this.labs = new ArrayList<>();
        } else {
            this.labs = labs;
        }
    }

    public Lab getLab(String labName) {

        for( Lab l : labs){
            if(l.getName() == labName){
                return l;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
      Lab lab = getLab(labName);
      if(lab == null){
          throw new UnsupportedOperationException();
      }
       lab.setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);

    }

    public LabStatus getLabStatus(String labName) {

        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        String ans = "";

        for(Lab l : labs){
            ans += l.getName() + " > " + getLabStatus(l.getName()) + "\n";
        }
        return ans.trim();
    }


}
