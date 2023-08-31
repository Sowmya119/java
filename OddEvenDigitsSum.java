import java.util.Scanner;

public class OddEvenDigitsSum {
    public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int digit = 0;
    int even_sum = 0;
    int odd_sum = 0;
    for(int n = sc.nextInt(); n!=0;n=n/10) {
      digit = n%10;
      if(digit%2 == 0)
        even_sum = even_sum + digit;
      else
        odd_sum = odd_sum + digit;
    }
    System.out.println(even_sum + " " + odd_sum);
    sc.close();
}   
}

/*Given a n digit number, Write a program to find the sum of even number digit and sum of odd number digit in the given number.

Sample Input:
65321

Sample Output:
8 9 */