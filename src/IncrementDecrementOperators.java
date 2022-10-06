public class IncrementDecrementOperators {
    public static void main() {
        int x=5,y,a=10,b,m=2,n=3;
        y=x++; //postIncrement - first value of x is assigned to y and then x gets incremented by 1 => y=5&x=6
        System.out.println(x+" "+y);
        b=++a;//preIncrement - first value of a gets incremented by 1 => a=11 & then assign its value to b
        System.out.println(a+" "+b);
        int expVal = m*n*++n; //2*3*4 -> now n=4 -> m=2,n=4
        int expVal1 = m*++n*n; //2*5*5 -> now n=5 -> m=2,n=5
        int expVal2 = 2*m++ + 3* ++n; // -> 2*2 (m = 3 after operation) + 3*6 (n gets incremented first & then mul with 3)
        int expVal3 = 2*m++ + 3*++m; // -> 2*3 ( then m gets 4) + 3*5 ( m gets 5 first and then mul with 3)
        System.out.println(expVal3+" "+m+" "+n);
    }
}
