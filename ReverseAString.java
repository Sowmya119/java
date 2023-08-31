import java.util.*;
public class ReverseAString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        int stringLength = originalString.length();
        String reversedString = new String();
        for(int i=stringLength-1; i>=0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }
        System.out.println(reversedString);
        sc.close();
    }
}

/*Input (stdin)
FacePrep

Output (stdout)
perPecaF */