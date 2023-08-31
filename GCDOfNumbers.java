import java.util.*;
public class GCDOfNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numArray = new int[count];
        int gcd = 1;
        for(int i=0; i<count; i++) {
            numArray[i] = sc.nextInt();
        }
        int minValue=numArray[0];
        for(int i=1; i<count; i++) {
            if(numArray[i]<minValue)
                minValue=numArray[i];
        }
        for(int i=2; i<=minValue; i++) {
            boolean condition = true;
            for(int j=0; j<count; j++) {
                if(numArray[j]%i==0)
                    continue;
                else {
                    condition = false;
                    break;
                }
            }
            if(condition==true)
                gcd=i;
        }
        System.out.println(gcd);
        sc.close();
    }
}
 

/*import java.util.*;
public class GCDOfNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int gcd=1;
        int value = num1;
        if(num1>=num2)
            value=num2;
        for(int i=1; i<=value; i++) {
            if(num1%i==0 && num2%i==0)
                gcd=i;
        }
        System.out.println(gcd);
        sc.close();
    }
} */