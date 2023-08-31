import java.util.*;
public class MostFrequentCharacter {
    static void frequencyCheck(String str) {
        int[] charCount = new int[str.length()];
        for(int i=0; i<str.length(); i++) {
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(i)==str.charAt(j))
                charCount[i]++;
            }
        }
        int maxIndex = 0;
        int maxCount = charCount[0];
        for(int i=1; i<str.length(); i++) {
            if(charCount[i]>maxCount) {
                maxCount = charCount[i];
                maxIndex = i;
            }
        }
        System.out.println(str.charAt(maxIndex));
        System.out.println(maxCount);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        frequencyCheck(str);
        sc.close();
    }
}
