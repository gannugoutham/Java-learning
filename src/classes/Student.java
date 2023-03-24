package classes;

public class Student {
    public String rollNumber;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return total()/3;
    }
    public char grade(){
        if(average()>60)
            return 'P';
        else return 'F';
    }

}
