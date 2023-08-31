import java.util.*;
public class StringPalindromeCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0;
        for(; i<str.length()/2;) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
                System.out.println("Not a Palindrome");
                break;
            }
            i++;
        }
        if(i>=str.length()/2)
            System.out.println("Is a Palindrome");
        sc.close();
    }
}
