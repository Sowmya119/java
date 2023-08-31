import java.util.*;
public class Pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            for(int k=i+1; k<num; k++) {
                System.out.print("-");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*Write a program to print the following pattern

*----
**---
***--
****-
*****

*/