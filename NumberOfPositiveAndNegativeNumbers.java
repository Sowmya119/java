import java.util.*;
public class NumberOfPositiveAndNegativeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numArray = new int[count];
        int positiveCount=0, positiveSum=0, negativeCount=0, negativeSum=0;
        int i=0, j=0;
        while(i<count) {
            numArray[i] = sc.nextInt();
            i++;
        }
        while(j<count) {
            if(numArray[j]>0) {
                positiveCount++;
                positiveSum = positiveSum + numArray[j];
            }
            else if(numArray[j]<0) {
                negativeCount++;
                negativeSum = negativeSum + numArray[j];
            }
            j++;
        }
        System.out.println("Number of positive numbers entered is " + positiveCount + " and the sum is " + positiveSum);
        System.out.println("Number of negative numbers entered is " + negativeCount + " and the sum is " + negativeSum);
        sc.close();
    }    
}

/*Write a program to that allows the user to enter 'n' numbers and finds the number of positive numbers entered and the number of negative numbers entered using a while loop.

Input Format:
Input consists of n+1 integers. The first integer corresponds to n. The next n integers correspond to the numbers to be added. Consider 0 to be a positive number.

Output Format:
Refer Sample Input and Output for formatting specifications.

Sample Input:
4
5
-2
-1
6

Sample output:
Number of positive numbers entered is 2 and the sum is 11 */