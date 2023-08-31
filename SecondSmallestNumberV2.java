import java.util.*;

public class SecondSmallestNumberV2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        int[] numArray = new int[numberOfElements];
        for(int i=0; i<numberOfElements; i++) {
            numArray[i] = sc.nextInt();
        }
        for(int i=0; i<numberOfElements; i++) {
            for(int j=i+1; j<numberOfElements; j++) {
                if(numArray[i]<=numArray[j]) {
                    int temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        System.out.println(numArray[1]);
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
