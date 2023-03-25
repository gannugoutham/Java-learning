package classes.overridingExample;

//Method-overiding -> redefining a method of a parent class in its child class.
class Car {
    public void start(){
        System.out.println("car is started");
    }
    public void accelerated(){
        System.out.println("car is accelerated");
    }
    public void changeGear(){
        System.out.println("car gear is changed");
    }
}

class LuxuryCar extends Car {

    public void start(){
        System.out.println("Luxury car is started");
    }
    public void accelerated(){
        System.out.println("Luxury car is accelerated");
    }
    public void changeGear(){
        System.out.println("automatic gear");
    }
    public void roofTop(){
        System.out.println("Roof top is present");
    }
}
public class OverridingExample {
    public static void main(String[] args){
        System.out.println("hello11");
        Car obj1 = new Car();
        obj1.start();
        //car is started - object of car is created and called its methods.

        LuxuryCar obj2 = new LuxuryCar();
        obj2.start();
        //Luxury car is started - object of Luxury car is created and called its methods.
        obj2.changeGear();
        //automatic gear - Luxury car method is called. i.e., method overriding


        //* Dynamic method Dispatch. -> Run time polymorphism.
        //It can call only those methods which are present in super class
        //If the called method is present and overrided in the object class i.e., subclass. we have to use the overrided method.
        /*Here new creates an object in the heap at run time. until the runtime,we don't know which object method is called so it is called run time polymorphism
         or dynamic method dispatch(calling a method).*/
        Car obj3 = new LuxuryCar();
        obj3.start();
        //Car class is the reference to obj3, Luxury car obj is created.
        //we cannot call the methods that are not present in the Car class.
    }
}
