package ExceptionHandling;

import java.lang.*;
/*
In java, by default they have the Exception classes which we can use to output the Exceptions at run-time.
Hierarchy -->  object class - ( Mother of all classes )
                    |
                    V
               throwable class
                    |
                    ------------------
                    |                 |
                Exception           Error
                    |
              1) classNotFoundException
              2) IOException
              3) InterruptedException
              4) NumberFormatException
              5) RuntimeException ---> 1) ArithmeticException
                                       2) IndexOutOfBoundException
                                       3) NullPointerException.

 1) Checked Exceptions - Must handle it using try catch block. java compiler forces to handle it via try catch.above num 1 to 4.
 2) unchecked Exception - it can be optional. it's our wish to handle try catch. above runtime exceptions.

 Methods in Exception class.
 1)String getmessage(); --> sout(e.getmessage());
 2)String toString();   --> sout(e);
 3)void printStackTrace();

 */

//custom exception class -> compulsorily inherits from Exception class.
class MinBalanceException extends Exception {
    //Minbalance = 5000;
    //overwrite the Exception class methods.
    public String toString(){
        return "Min balance should be 5000";
    }
}

public class ExceptionClasses {
    public static void main(String[] args){
        System.out.println("main method started");
        main1();
        System.out.println("main method ended");
    }
    static void main1(){
        try{
            main2(10,0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    //if we write a custom message Exception by creating Exception object -> throw is used.
    //if there is a throw in the method, then we need to use throws Exception.
    //If we are using throw and throws in method. the calling method definitely have a try catch block to capture the exception e
    static int main2(int a, int b) throws Exception{
        if(b==0){
            throw new Exception("b cannot not be zero");
        }
        return a/b;
    }
}

//try with resources is used to handle the exceptions while using resources such as file etc..,

