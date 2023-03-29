package classes.interfacesExample.InterfaceProperties;

interface Test1 {
    final static int x= 10; //final static is default for properties.
    public abstract void meth1(); // by default the methods are public and abstract.
    public abstract void meth2();
    //all the below methods in interfaces should require a body.
    private void meth3(){ //even though it cant be used outside the class,the purpose is - it can be used by default methods in the same interface.
        System.out.println("meth3 - private method in Test1 Interfaces");
    }
    public static void meth4(){
        System.out.println("meth4 - public static method in Test1 interface");
    }
    //default methods are available when they don't have the implementation in their derived interfaces.
    default void meth5(){
        meth3();
        System.out.println("meth5 - default method in Test1 interface");
    }
}
//interfaces can be inherited.
interface Test2 extends Test1 {
    void meth();
    //default methods can be overrided.
    default void meth5(){
        System.out.println("meth5 - default method in Test2 interface");
    }
}
class Parent implements Test2 {
    //as it implements from Test2 interfaces, it holds all the methods from Test1 and Test2.
    //to make it non-abstract class - define all the methods.

    @Override
    public void meth() {System.out.println("");}
    @Override
    public void meth1() {}
    @Override
    public void meth2() {}
}
public class InterfaceProperties {
    public static void main(String[] args){
        System.out.println("main method called");
        System.out.println(Test1.x); //static properties can be called without creating objects.
        Test1.meth4(); //static methods can be called without creating objects.

        Parent obj = new Parent();
        obj.meth5(); // meth5 - default method in Test2 interface
    }
}
