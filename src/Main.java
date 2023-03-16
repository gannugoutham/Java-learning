import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a=10, b=15, c;
        c = max(a,b); //a,b are actual parameters or arguments.
        System.out.println("max "+ c);
    }

    //method needs to be static as it is calling from static method main.
    static int max(int x, int y){ //x,y are formal parameters
        if(x>y){
            return x;
        } else return y;
    }
}