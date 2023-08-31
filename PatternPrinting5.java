import java.util.*;
public class PatternPrinting5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int length=(2*count)-1;
        int midValue=length/2;
        for(int i=0; i<=midValue; i++) {
            for(int j=0; j<length; j++) {
                if(j<=midValue+i && j>=midValue-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=midValue+1; i<length; i++) {
            for(int j=0; j<length; j++) {
                if(j<=midValue+length-i-1 && j>=midValue-length+i+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*Sample Input 1:

4



Sample Output 1:
  *
 ***
*****
*******
 *****
 ***
  *

Sample Input 2:
5

Sample Output 2:
  *
  ***
 *****
 *******
*********
*******
 *****
  ***
*

 */