import java.util.*;
public class NumberOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int modNum = 0;
        int digitCount = 0;
        if(num>0)
            modNum = num;
        else if(num==0)
            digitCount=1;
        else
            modNum = -num;
        while(modNum>0) {
            modNum = modNum/10;
            digitCount++;
        }
        System.out.println(digitCount);
    }
}
