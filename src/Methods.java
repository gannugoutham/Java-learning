import java.util.Arrays;

public class Methods {
    public static void main() {

        int a = 10, b = 15, c;
        int A[] = {12, 13, 14, 15, 16};

        c = max(a, b); //a,b are actual parameters or arguments.
        System.out.println("max " + c);

        Main mn = new Main(); //object of main method is crated to call non-static maxNumber method.

        increment(a);
        System.out.println("value of a after passing to increment method " + a);

        objectAsParameterMethod(A);
        System.out.println("value of A[0] after passing to the method objectAsParameterMethod " + A[0]);
        //here the value of A[0] gets modified after passing to the objectAsParameterMethod method.
        // here object is passed as a parameter to the method => reference of A[] is copied to arr =>the
        //object that are referring by the both of the arrays are same => original content gets modified.

        System.out.println("checkprime " + checkPrimeNumber(+-10));
        sumOfAllElements(4,2,3);
    }

    //Parameter passing in java(i.e., is similar to call by value & call by reference in c, c+++)
    //Primitive data types(int, float, double etc.,) -> actual parameters are passed to the method -> it is copied to formal parameters(in method)
    // and gets modified inside the method and that doesn't change the actual parameters -> similar to call by value.
    //non-primitive data types(str, arr etc.,) -> object reference of actual parameter gets copied to the formal parameters.
    //so both are pointing to the same object => actual object gets modified in the method -> similar to call by reference.
    static void objectAsParameterMethod(int[] arr) {
        arr[0] = 1924;
        System.out.println("arr " + arr[0]);
    }

    //call by value method. value of a remains 10 after it is passing to this method and gets incremented by 1.
    static void increment(int x) {
        x++; //value of x that copied from a gets 11 but the actual value of a remains 10.
        //actual parameter a can't be modified but the formal parameter x gets changed.
        System.out.println("o/p value from increment method " + x);
    }

    //method needs to be static as it is calling from static method main without creating an object.
    static int max(int x, int y) { //x,y are formal parameters
        if (x > y) {
            return x;
        } else return y;
    }

    //non-static method - to call this method, needs to create an object.
    int maxNumber(int p, int q) {
        if (p > q) {
            return p;
        } else return q;
    }

    static int checkPrimeNumber(int x) {
        if (x >= 2) {
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    System.exit(0);
                }
            }
            return x;
        }
        return 0;
    }

    static boolean isPrime(int x) {
        for (int i = 2; i <= i / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Method overloading -> writing more than 1 method with same name having different parameter list i.e.,
// either diff data types parameters list or same data types but more or less params passed.
//all the below method names are same but having diff params
    static int maxNum(int x, int y) {
        return x > y ? x : y;
    }

    static int maxNum(int x, int y, int z) {
        return x > y && x > z ? x : (y > z ? y : z);
    }

    static float maxNum(float x, float y) {
        return x > y ? x : y;
    }

    //Variable Arguments -> The method should work for any(variable) number of arguments of same type.
//Input -> passing multiple arguments of same type. but the method considered them in an array.
//void show(int...x) -> stores in x[] -> three dots need to write
//From java 1.7 -> System.out.printf();
//called varargs
    static void show(int...x){ //as many as int type arguments can be passed to this method.
        for (int eachElement:x) { //printing each element using for each method from the created array X.
            System.out.println(eachElement);
        }
    }

    //Ex- Maximum of numbers
    static int maxNumberValue(int... max){ //here max is an array
//        int[] store = Arrays.sort(max); This statement will throw an error because the
//        return type of sort method would be void. but we tried to store it in int type.
        //Instead we can copy the max array and perform sort on it. if we want to keep max
        Arrays.sort(max);
        int maxValue = max[max.length-1];
        return maxValue;
    }

    //sum of all the elements
    static int sumOfAllElements(int... inputSet){
        int sum=0;
        for(int x: inputSet){
            sum+=x;
        }
        return sum;
    }

}

