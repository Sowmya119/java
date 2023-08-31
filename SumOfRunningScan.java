import java.util.*;
public class SumOfRunningScan {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        int sum=0;
        while(num!=-1) {
            num=sc.nextInt();
            sum+=num;
        }
        System.out.println(sum+1);
        sc.close();
    }
}

/*Write a program to print the sum of the given numbers. The values must be scanned until the user enters -1 as value.
INPUT & OUTPUT FORMAT: Input consists of a list of integers. The output consists of the sum of the given integers.

SAMPLE INPUT:
1
2
3
4
-1

SAMPLE OUTPUT:
10

 */