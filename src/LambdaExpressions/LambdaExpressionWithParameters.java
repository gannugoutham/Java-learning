package LambdaExpressions;

@FunctionalInterface //annotation is used when only one abstract method is present in interface.
interface Lambda1 {
    void display(String s); //by default interface methods are public and abstract.
    //return type is void as we are not returning anything in the main method.
    //input parameter is of string type.
}

interface Lambda2 {
    int sum(int x, int y); //by default interface methods are public and abstract.
    //return type is int as we are returning int value in the main method.
    //input parameters is of int type.
}
public class LambdaExpressionWithParameters {
    public static void main(String[] args){
        System.out.println("Lambda Expressions");

        Lambda1 obj = (s) -> {System.out.println(s);}; //string argument s is passed and it can be used in the expressions.
        obj.display("hello"); //"hello" string is passed as an argument to the method.

//       Lambda2 obj2 = (a,b) -> {return a+b;}; //a and b parameters of int type are taken and returning its sum.
//       System.out.println(obj2.sum(2,3));
//       in shortcut we use the below method, when we have a single expression.

        Lambda2 obj2 = (a,b) -> a+b;
        System.out.println(obj2.sum(566,3));
    }
}
