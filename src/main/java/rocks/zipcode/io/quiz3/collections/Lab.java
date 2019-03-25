package rocks.zipcode.io.quiz3.collections;

import java.util.Comparator;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab>{


    String nameOfLab;
    LabStatus labStat;


    public Lab() {
        this(null);
    }

    public Lab(String labName) {

        this.nameOfLab = labName;
        this.labStat = LabStatus.INCOMPLETE;
    }

    public String getName() {
        return this.nameOfLab;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStat = labStatus;
    }

    public LabStatus getStatus() {

        if(labStat == null){
            throw new UnsupportedOperationException();
        }
        return labStat;
    }


    @Override
    public int compareTo(Lab o) {
        return this.getName().compareTo(o.getName());
    }
}
