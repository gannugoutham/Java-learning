package classes.interfacesExample;

//Abstraction can be achieved by Interfaces(implements) and abstract classes(extends).
//Interface methods are abstract and public by default.so they don't have body.

class Phone {
    public void call(){
        System.out.println("Make a call from phone");
    }
    public void message(){
        System.out.println("Make a message from phone");
    }
}
interface Musicplayer {
    // void pause(){ System.out.println("paused"); }
    // Pause method is not valid -> Interface abstract methods cannot have body.
    // interface methods are abstract and public by default.so they don't have body.
    void play();
    void stop();
}
interface camera { //both small and cap letters are allowed for initials.
    void record();
    void snap();
}
class Smartphone extends Phone implements Musicplayer, camera {
    public void message(){
        System.out.println("Make a message from smart phone");
    }

    @Override
    public void play() {
        System.out.println("Music is played from Musicplayer interface in smartphone");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped from Musicplayer interface in smartphone");
    }

    @Override
    public void record() {
        System.out.println("record is enabled from camera interface in smartphone");
    }

    @Override
    public void snap() {
        System.out.println("snap is captured from camera interface in smartphone");
    }
}
public class interfacesExample {
    public static void main(String[] args){
        System.out.println("Main method called");

        Phone obj1 = new Phone();
        obj1.message(); // Make a message from phone

        Smartphone obj2 = new Smartphone();
        obj2.message(); // Make a message from smart phone -> method override in child class.
        //obj2 has all the 6 methods

        Phone obj3 = new Smartphone();
        obj3.message(); // Make a message from smart phone -> override method from child class is written as child class object is created.
        //obj3 holds only 2 methods. as it referring to the phone Class. call() and message().

        Musicplayer obj4 = new Smartphone();
        obj4.play(); // Music is played from Musicplayer interface in smartphone.
        obj4.stop(); // Music is stopped from Musicplayer interface in smartphone.
        //obj4 holds the methods in interface Musicplayer and write the impl from the smartPhone class.

        camera obj5 = new Smartphone();
        obj5.record(); // record is enabled from camera interface in smartphone.
        obj5.snap(); // snap is captured from camera interface in smartphone.
        //obj5 holds the methods from camera interface and writes the impl from the smartphone class.

        //From above three 3 objs we can see for the same smartphone object, depending on the references i.e., phone & Interfaces camera, musicplayer -> we can call the different methods.
    }
}
