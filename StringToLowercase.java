import java.util.*;
public class StringToLowercase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String lowerStr = new String();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
                char lowerChar = (char) ((int) str.charAt(i) + 32);
                lowerStr += lowerChar;
            }
            else
                lowerStr += str.charAt(i);
        }
        System.out.println(lowerStr);
        sc.close();
    }
}
