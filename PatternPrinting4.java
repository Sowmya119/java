import java.util.*;
public class PatternPrinting4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        for(int i=0; i<count; i++) {
            for(int j=0; j<=i; j++) {
                if(j%2==0)
                    System.out.print("*");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*Sample Input:
5

Output:
*
*#
*#*
*#*#
*#*#*

*/