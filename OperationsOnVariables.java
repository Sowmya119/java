import java.util.*;

public class OperationsOnVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        int a = sc.nextInt();
        float b = sc.nextFloat();
        double c = sc.nextDouble();
        long l = sc.nextLong();
        double res1 = b/c;
        int res2 = (int)c/a;
        long res3 = res2+l;
        System.out.println(res1 + " " + res2 + " " + res3);
        System.out.println(d + " " + d.charAt(3));
        sc.close();
    }    
}

/*Given four different variables of different data types: a (int), b (float), c (double), l (long), d (string).The task is to do step-wise operations as given below:
1. Divide b by c.
2. Divide c by a (cast to int).
3. Add result of step 2 with l.
4. Print the given string, and the 4th (0-based indexing) character of the string both separated by a space.


Input format:
The input consists of two lines.
The first line consists of the string d.
The second line consists of space separated entries a, b, c, l.


Output format:
The output consists of two lines.
Print the results of the first 3 steps separated by space.
In the next line, print the string and the 4th character of the string, separated by space.


Input:
face
1 2 3 5

Output:
0.666667 3 8 
face e

 */