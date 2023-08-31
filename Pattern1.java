import java.util.*;
public class Pattern1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
        sc.close();
    }    
}

/*The function patternPrint(int n) supposed to print n number of lines in the following pattern
For n=4 the pattern should be:
1
1 1
1 1 1
1 1 1 1

The function compiles successfully but fails to return the desired
results due to logical errors.
Your task is to debug the program to pass all the test cases.

Sample Input:
4

output:
1
1 1
1 1 1
1 1 1 1 */