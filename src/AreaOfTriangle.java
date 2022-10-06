import java.util.*;
import java.lang.*;

public class AreaOfTriangle {
    public static void main() {
        float base, height, area, side1, side2, side3, semiPerimeter;
        String conditionValue;

        System.out.println("Do you have base and height of a triangle, Enter Y or N ");
        Scanner condition = new Scanner(System.in);
        conditionValue = condition.next();
        if(conditionValue.equals("Y")) {
            System.out.println("Enter base value ");
            Scanner sc = new Scanner(System.in);
            base = sc.nextFloat();
            System.out.println("Enter height value ");
            Scanner sca = new Scanner(System.in);
            height = sca.nextFloat();
            area = (float) (0.5*base*height);
            System.out.println("Area of triangle is"+ area);
        }
        else {
            System.out.println("Enter sides of triangle ");
            Scanner sc = new Scanner(System.in);
            side1 = sc.nextFloat();
            side2 = sc.nextFloat();
            side3 = sc.nextFloat();
            semiPerimeter = (side1 + side2 + side3)/2;
            float v = semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3);
            area = (float) Math.sqrt(v);
            System.out.println("Area of triangle is"+ area);
        }
    }
}
