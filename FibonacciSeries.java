import java.util.*;
public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int num1=0, num2=1, sum=0;
        for(int i=0; i<count; i++) {
            System.out.print(sum + " ");
            num1=num2;
            num2=sum;
            sum=num1+num2;
        }
        sc.close();
    }
}

/*Sample Input:
6

Sample Output:
0 1 1 2 3 5 */

/*import java.util.*;
public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int[] fibArray=new int[count];
        for(int i=0; i<count; i++) {
            if(i==0)
                fibArray[i]=0;
            else if(i==1)
                fibArray[i]=1;
            else
                fibArray[i]=fibArray[i-1]+fibArray[i-2];
        }
        for(int n : fibArray) {
            System.out.print(n + " ");
        }
        sc.close();
    }
}
 */