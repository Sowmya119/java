import java.util.*;
public class QuadraticEquationRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double sol1=0, sol2=0;
        if(Math.sqrt(b*b-4*a*c)>=0) {
            sol1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
            sol2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println(String.format("%.2f", sol1));
            System.out.println(String.format("%.2f", sol2));

        }
        else
        System.out.println("imaginary");
        sc.close();
    }
}

/*Write a program to find the roots of a given quadratic equation.
The equation will be in the form of ax2 + bx + c = 0. The input will be 3 integers a, b and c and the output will be the roots of the equation. The roots need to be floating point integers with 2 precision digits.



Sample input:
1
-1
-6

Output:
3
-2

 */
