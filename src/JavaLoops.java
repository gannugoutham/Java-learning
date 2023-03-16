import java.util.Arrays;

public class JavaLoops {
    public static void main(String[] args) {
        int i = 0, j=0;
        //while loop
        while(i<10) {
            i++;
        }

        //do while loop
        do{
            j++;
        }while(j<10);

        //for loop
        int kreverse = 0;
        for(int k=123456; k>0; k=k/10) {
            kreverse= kreverse*10 + k%10;
        }
//        System.out.println(kreverse);

        int val = 0;
        for(;val<10; val++) { //initialization is optional, we can do it at global level
        }

        for(;val<10;) { //update is optional here
            val++;  // we can do it in body as well
        }

//        for(;;) {
//            val++; //results a infinite loop
//        }

        for(int val1=0, val2=1 ; val1<10 ; val1++, val2*=2 ) {
//            System.out.println(val1);
        }

        //Ex -  Multiplication  table
        int mulNum = 17;
        for(int mul=1; mul<=10; mul++) {
//            System.out.println(mulNum+" * " + mul +" = " + mulNum*mul );
        }

        //Ex - find sum of n numbers
        int sum=0, sumTill=20;
        for(int p=1; p<=sumTill; p++) {
            sum+=p;
        }
//        System.out.println(sum);

        //Ex - Factorial of a number
        int factNum=100; double factVal=1;
        for(int p=1; p<=factNum; p++) {
            factVal = factVal*p;
        }
//        System.out.println(factVal);

        //Ex-
        for(int p=0; p<5; p++) {
//            System.out.println(p); //prints the output line by line
//            System.out.print(p); //prints the output in same line
        }

        //Ex - printing stars in triangular shape
        for(int x=1; x<=6; x++) {
            for(int y=0; y<=x; y++) {
                System.out.print("* ");
            }
            for(int y=6; y>=6-x; y--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
