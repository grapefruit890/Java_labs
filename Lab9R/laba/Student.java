package Package6.laba;

public class Student {
    private int iDNumber;
    private int GPA;
    Student(int idnumber, int gpa){
        this.iDNumber = idnumber;
        this.GPA = gpa;
    }

    public int getNum(){
        return iDNumber;
    }
    public void setNum(int idnumber){
        this.iDNumber = idnumber;
    }
    public int getGPA(){
        return GPA;
    }
    public void setGPA(int gpa){
        this.GPA = gpa;
    }
}