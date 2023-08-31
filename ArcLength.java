import java.util.*;

public class ArcLength {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float centralAngle = sc.nextFloat();
        double pi = 3.14;
        double arcLength = (centralAngle/360) * (2*pi*radius);
        System.out.println(String.format("%.2f", arcLength));
        sc.close();
    }
}

/*Program to find the arc length of a circle.

The input radius and center angle must be a float variables, the output should also be printed as a floating point value with 2 point precision. No other extra information should be printed except the arc length value to the stdout. (Assume PI = 3.14)

Input (stdin)
25
50

Output (stdout)
21.81 */