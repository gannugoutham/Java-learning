package StaticAndFinalKeywords;

//class having a private constructor.

class Singleton {
    private String name;
    private String school;
    private int age;
    static Singleton obj=null;

    private Singleton(String name, String school, int age){
        this.name = name;
        this.school=school;
        this.age=age;
    }
    //static method -> can be called from main class without creating an object.
    static Singleton getInstance(){
        if(obj==null){
            obj=new Singleton("gannu", "lewis", 25);
        } return obj;
    }
}

public class SingletonClass {
    public static void main(String[] args){
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        System.out.println(obj1+" "+obj2+" "+obj3);
        if(obj1==obj2 && obj1==obj3){
            System.out.println("same objects");
        }
    }
}
