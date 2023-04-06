package LambdaExpressions;

//Inorder to use the lambda expressions to implement the body of interface methods, interface must have only one method.
@FunctionalInterface //annotation is used when only one abstract method is present in interface.
interface Lambda {
    void display(); //by default interface methods are public and abstract.
}
//class MyLambda implements Lambda {
//    public void display(){}
//}
// -> instead of using this we can directly implement the body using lambda functions as shown in main method.

public class LambdaExpressionPractise {
    public static void main(String[] args){
        System.out.println("Lambda Expressions");
        Lambda obj = () -> {System.out.println("display method is implemented");};
        obj.display();
    }
}
