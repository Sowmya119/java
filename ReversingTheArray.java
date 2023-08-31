import java.util.*;
public class ReversingTheArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        int[] numArray = new int[numberOfElements];
        for(int i=0; i<numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }
        for(int i=numArray.length-1; i>=0; i--) {
            System.out.println(numArray[i]);
        }
        sc.close();
    }
}

/*Write a Program to reverse the array.

Input Format
First line - Number of elements in the array
Second line - All the elements separated by space

Output Format
Print a reversed array where all elements are separated by a space

Sample Input:
5
1 2 3 4 5

Output:
5 4 3 2 1
*/