import java.util.*;

public class SecondSmallestNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b) {
            if(b>c)
            System.out.println(b);
            else
            System.out.println(c);
        }
        else if(b>c) {
            if(a>c)
            System.out.println(a);
            else
            System.out.println(c);
        }
        else {
            if(b>a)
            System.out.println(b);
            else
            System.out.println(a);
        }
        sc.close();
    }
}

/*Write a program to accept three unequal numbers and display the second smallest number

Input Format:
The input consists of three integers

Output Format:
The output consists of one integer value

Sample Input:
2
5
8

Sample Output:
5 */