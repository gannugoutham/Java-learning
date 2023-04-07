package StaticAndFinalKeywords;

class Student {
    static String name;
    static int rollno;
    static int counter=0;
    public Student(String name){
        this.name= name;
        this.rollno= counter;
        counter++;
    }
//    {
//        System.out.println(counter);
//    }
}
public class StaticProblem {
    public static void main(String[] args){
        System.out.println("main method called");
        Student obj1 = new Student("gannu1");
        Student obj2 = new Student("gannu2");
        Student obj3 = new Student("gannu3");
    }
}
