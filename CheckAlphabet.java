import java.util.*;
public class CheckAlphabet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        char[] charArray = new char[count];
        for(int i=0; i<count; i++) {
            charArray[i] = sc.next().charAt(0);
        }
        for(int i=0; i<count; i++) {
            if((charArray[i]>=65 && charArray[i]<=90) || (charArray[i]>=97 && charArray[i]<=112))
            System.out.println("Yes");
            else
            System.out.println("No");
        }
        sc.close();
    }
}