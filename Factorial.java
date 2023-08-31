import java.util.*;
public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        if(num==0 || num==1)
        System.out.println(factorial);
        else {
            for(int i=2; i<=num; i++) {
                factorial = factorial*i;
            }
            System.out.println(factorial);
        }
        sc.close();
    }
}

/*Write a program to find the Factorial of the given number

Factorial of a number

Input:
5

Output:
120
 */