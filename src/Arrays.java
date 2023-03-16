import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //Declaration of array A of type int.
        // A[] is a reference that holds the address of the int[10] ==> is an object.
        // int[10] also hold the length of the array, so it is a property. A.length = 10 ( not A.length(), not a method.)
        int A1[] = new int[10]; //default value is 0
        int[] A2 = new int[10];
        int[] A3 = new int[10]; //A1,A2,A3 represents the same.

        //or we can use this as well
        int C[];
        C = new int[10];

        //Declaration and initialization of array B
        int B[] = {199, 26, 31234, -4, -1925, 6, 0};

        //for each loop, it iterates through each element of an array.
        for (int x : B) {
//            System.out.println("eachElement " + x);
        }

        //searching an element in an array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputEntered = sc.nextInt();
        for (int i = 0; i < B.length; i++) {
            if (B[i] == inputEntered) {
                System.out.println("Element Found at " + i);
                System.exit(0); //stops executing the program
            }
        }
        System.out.println("Element not found");

        //finding max element in an array
        int max = B[0], secondMax = B[0];
        for (int i = 1; i < B.length; i++) {
            if (B[i] > max) {
                secondMax = max;
                max = B[i];
            }
        }
//        System.out.println("max "+ max);
//        System.out.println("secondMax "+ secondMax );

        //Two dimensional arrays
        int D1[][] = new int[3][3];
        int[] D2[] = new int[3][3];
        int[][] D3 = new int[3][3];
        int[][] D6 = new int[3][3];
        int D4[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

        int D5[][];
        D5 = new int[5][5];

        int[] E, F[];
        E = new int[3];  //E is single dimensional array
        F = new int[3][3];  //F is 2 dimensional array

        int G[][] = {{1, 2, 3}, {3, 4, 5}, {5, 6, 7}};
        for (int x[] : G) {  //x[] is referring to each row of G.
            for (int y : x) {
                System.out.println(y);
            }
        }
    }
}
