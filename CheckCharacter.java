import java.util.*;

public class CheckCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if((c>=65&&c<=90) || (c>=97)&&(c<=122))
        System.out.println(c + " is alphabet");
        else if((c>=48&&c<=57))
        System.out.println(c + " is digit");
        else
        System.out.println(c + " is special character");
        sc.close();
        
        // System.out.println((int) c); --> To print ASCII value
        
        // Another way to print ASCII value
        // int a = 'd';
        // System.out.println(a);
    }
}
