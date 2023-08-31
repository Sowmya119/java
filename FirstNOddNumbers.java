import java.util.*;
public class FirstNOddNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=1; i<=count; i++) {
            System.out.println((2*i)-1);
        }
        sc.close();
    }
}

/*Write a program to print the "n" odd numbers using for loop.

Sample Input:
5

Sample Output:
1
3
5
7
9 */