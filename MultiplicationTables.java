import java.util.*;
public class MultiplicationTables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = sc.nextInt();
        int i = 1;
        System.out.println("The multiplication table of " + num + " is");
        while(i<=count) {
            System.out.println(i+"*"+num+"="+(i*num));
            i++;
        }
        sc.close();
    }
}

/*Write a program to print the multiplication table of an integer n upto m rows using a while loop.

Input Format:
Input consists of 2 integers. The first integer corresponds to n. The second integer corresponds to m.

Output Format:
Refer Sample Input and Output for formatting specifications.

Sample Input:
5
4

Sample Output:
The multiplication table of 5 is
1*5=5
2*5=10
3*5=15
4*5=20
 */