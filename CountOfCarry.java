import java.util.*;
public class CountOfCarry {
    public static int numberOfCarries(int num1, int num2) {
        int count=0;
        int carry=0, digit1=0, digit2=0;
        while(num1!=0 || num2!=0) {
            carry = (digit1+digit2)/10;
            digit1 = num1%10;
            digit2 = num2%10;
            if(digit1+digit2+carry >= 10)
            count++;
            num1 = num1/10;
            num2 = num2/10;
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(numberOfCarries(num1, num2));
        sc.close();
    }
}

/*A carry is a digit that is transferred to the left if the sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time
You are required to implement the following function.
Int NumberOfCarries(int num1 , int num2);
The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return the total number of carries generated while adding digits of two numbers ‘num1’ and ‘ num2’.
Assumption: num1, num2>=0

Example:
Input
Num 1: 451
Num 2: 349
Output
2
*/