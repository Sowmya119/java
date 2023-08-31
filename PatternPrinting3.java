import java.util.*;
public class PatternPrinting3 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        for(int i=0; i<count; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(String.format("%c",j+97));
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
 Sample Input 1:
5

Sample Output 1:
a
ab
abc
abcd
abcde


Sample Input 2:
3

Sample Output 2:
a
ab
abc

 */