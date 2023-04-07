package StaticAndFinalKeywords;

class StaticKeyword {
    static int x=10; //static variables are commonly shared by all the objects.They are not stored in the heap.
    int y=15; //non-static variable.

    void show(){ //non-static methods can access the static and non-static variables.
        System.out.println(x);
        System.out.println(y);
    }
    static void show1(){ //static methods cannot access the non-static variables. access via object.
        System.out.println(x);
        StaticKeyword obj1 = new StaticKeyword();
        System.out.println(obj1.y);
    }
}

public class StaticPractise {
    //static blocks are used to load/initialize something during the class is loading.
    static{
        System.out.println("static Block 1");
    } //static block are loaded when class is loaded.
    public static void main(String[] args) {
        System.out.println("static practise");
        StaticKeyword obj = new StaticKeyword();
        obj.show();
        StaticKeyword.show1(); //static methods and variables can be accessed directly without creating an object.

        StaticKeyword.x = 20; //if you change a static variable. this change is reflected in all the objects.
        //static variables have a single copy shared by all the objects.
    }
    static {
        System.out.println("static Block 2");
    }
}
