import java.util.*;
public class LongerString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numberOfStrings = sc.nextInt();
        String[] strArray = new String[numberOfStrings];
        int[] lengthArray = new int[numberOfStrings];
        for(int i=0; i<numberOfStrings; i++) {
            strArray[i]=sc.next()+" ";
        }
        for(int i=0; i<numberOfStrings; i++) {
            for(int j=0; j<strArray[i].length(); j++) {
                if(strArray[i].charAt(j) != ' ')
                    lengthArray[i]++;
            }
        }
        int longestStringIndex = 0;
        int longestStringLength = lengthArray[0];
        int secondlongestStringIndex = 0;
        int secondlongestStringLength = lengthArray[0];
            
        for(int i=1; i<numberOfStrings; i++) {
            if(lengthArray[i]>longestStringLength) {
                longestStringLength = lengthArray[i];
                longestStringIndex = i;
            }
        }
        if(longestStringIndex!=0) {
            for(int i=1; i<numberOfStrings; i++) {
                if(lengthArray[i]>secondlongestStringLength && longestStringIndex!=i) {
                secondlongestStringLength = lengthArray[i];
                secondlongestStringIndex = i;
            }
        }
        }
        else {
            secondlongestStringIndex = numberOfStrings-1;
            secondlongestStringLength = lengthArray[numberOfStrings-1];
            for(int i=1; i<numberOfStrings; i++) {
                if(lengthArray[i]>secondlongestStringLength) {
                secondlongestStringLength = lengthArray[i];
                secondlongestStringIndex = i;
            }
        }
        }
        System.out.println(strArray[longestStringIndex]);
        System.out.println(strArray[secondlongestStringIndex]);
        sc.close();
    }
}
