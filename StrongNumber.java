import java.util.*;
public class StrongNumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int strongValue=0;
        while(temp>0) {
            int digit=temp%10;
            int fact=1;
            for(int i=1; i<=digit; i++) {
                fact=fact*i;
            }
            strongValue+=fact;
            temp=temp/10;
        }
        sc.close();
        if(num==strongValue)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

/*A number can be said as a strong number when the sum of the factorial of the individual digits is equal to the number.

For example, 145 is a strong number. 1! + 4! + 5! = 145. Write a program to check whether a given number is a strong number or not.

Input Format:
Input consists of an integer.

Output Format:
Print Strong number or not.

Sample Input1:
145

Sample Output1:
Yes

Explanation:
= 1! + 4! +5!
= 1+24+120
= 145

Sample Input2:
123

Sample Output2:
No

Explanation:
= 1! + 2! + 3!
= 1+2+6
= 9 */