package ExceptionHandling;

import java.lang.*;

/* Types of Errors.
1) Syntax Errors - Errors due to typing,grammar etc.., figure out by compiler.
2) Logical Errors - Can be figure out by debugger.
above two errors are due to programmer.
3) Runtime Errors - Errors occured due to bad Input, internet connection, insufficient resources etc.., from the user.
Runtime Errors can be handled by Exception Handling.
*/


public class ErrorTypes {
    static void method(){

        int a=10,b=5,c=0,d,e;
        int f = a/(2*b);
        //try and catch block captures all the exception and make the other code run smoothly without crashing.
        //try block executes the code and if any error occurs, it can be caught by the catch block.
        //we can have multiple catch blocks.
        //finally block executes compulsorily irrespective of error or no error.
        try {
            d = a / b;
            System.out.println("d: " + d);
            e = a / c;
            System.out.println("e: " + e);
        }
        catch(ArithmeticException exception){
            System.out.println(exception);
        }
        finally {
            System.out.println("finally block is executed");
        }
    }
    //we can have nested try catch blocks in a try block.
    static void method1(){
        int arr[]={0,1,2,3,4,5,6};
        try{
            System.out.println("inside try block");
            try{
                System.out.println("inside nested try block");
                int a=arr[1]/arr[0];
            }
            catch(ArithmeticException e){
                System.out.println("dividing with 0 "+ e);
            }
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("called an non-existed array index "+ e);
        }
    }
    //we can have multiple catch blocks for a try block.
    //But if we get one exception, then it goes to catch block. so it won't execute the other code in try block which prevents by throwing all the exceptions.
    static void method2(){
        int arr[]={0,1,2,3,4,5,6};
        try{
            System.out.println("inside try block");
            int a=arr[1]/arr[0];
            System.out.println(arr[10]);
        }
        catch(ArithmeticException e){
            System.out.println("dividing with 0 "+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("called an non-existed array index "+ e);
        }
    }
    public static void main(String args[]){
        System.out.println("main method started...");
        ErrorTypes.method2();
        System.out.println("main method ended.");
    }
}
