package classes.abstractionExample;

//An abstract class is declared as abstract class className.
/*An abstract class may or may not have the abstract methods(method that doesn't have a body) but a class should be compulsorily abstract class if it contains atleast one abstract method.*/
//Purpose of an abstract class is to use its abstract methods in its subclasses(inheritance) so that we can design the method body(implementation) as per our requirements.

abstract class Parent {
    abstract void method1();
    void method2(){
        System.out.println("method that defined in parent abstract class");
    }
}

class Child extends Parent{
    void method1(){
        System.out.println("method1 implementation is defined");
    }
    //If we don't define the method1 from the parent class(method override) then this child class also should be declared as abstract class.
    //error -> Class 'Child' must either be declared abstract or implement abstract method 'method1()' in 'Parent'
}

public class AbstractionExample {
    public static void main(String[] args){

        // Parent obj = new Parent(); -> Parent' is abstract; cannot be instantiated.

        Child obj1 = new Child();
        obj1.method1();
        //o/p -> method1 implementation is defined

        Parent obj = new Child(); //runtime polymorphism is we generally use.
        //i.e. obj contains only the methods in Parent class & o/p of methods are taken from the child class overrided methods.
        obj.method1();
        //o/p -> method1 implementation is defined
    }
}
