package StaticAndFinalKeywords;

// final variables are cannot be modified.
// finals methods are cannot be overrided.
// finals classes are cannot be extended.
class FinalClass {
    final int x=10; //initialized directly.
    final String NAME; //final variables names to be in uppercase is a better practise.
    static final String LASTNAME;

    final String FULLNAME;

    //initialized NAME in a non-static instance block as the variable is non-static.
    {
        NAME="Goutham";
    }
    //initialized LASTNAME in a static instance block as the variable is static.
    static {
        LASTNAME="GANNU";
    }
    //initialized in a constructor.
    FinalClass(){
        FULLNAME="Goutham Gannu";
    }
}
public class FinalPractise {
}

class Test {
    public final void display(){
        System.out.println("final method is called. this can't be overrided");
    }
}

class SubTest extends Test {
//    public void display(){ //doesn't allow to override the methods.
//    }
    public void display1(){
        System.out.println("other methods can be declared and used");
    }
}