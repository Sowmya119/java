import java.util.*;
public class MostFrequentCharacterRev {
    static int MostFrequentChar(char str[], int n) {
        int[] countArray = new int[26];
        for(int i=0; i<n; i++) {
            for(int j=0; j<26; j++) {
                if(str[i]-97==j)
                    countArray[j]++;
            }
        }
        int maxCount = 0;
        for(int i=0; i<26; i++) {
            if(countArray[i]>maxCount)
                maxCount=countArray[i];
        }
        return maxCount;
    }
    static char MostFrequentCharValue(char str[], int n) {
        int[] countArray = new int[26];
        for(int i=0; i<n; i++) {
            for(int j=0; j<26; j++) {
                if(str[i]-97==j)
                    countArray[j]++;
            }
        }
        int maxCount = 0;
        int maxIndex = 0;
        for(int i=0; i<26; i++) {
            if(countArray[i]>maxCount) {
                maxCount=countArray[i];
                maxIndex=i;
            }
        }
        return (char) (maxIndex+97);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        System.out.println(MostFrequentChar(str.toCharArray(), n));
        System.out.println(MostFrequentCharValue(str.toCharArray(), n));
        sc.close();
    }
}

/*Write a program to declare this "int MostFrequentCharaceter(char str[], int n);" function. The function accepts a string ‘str’ of length ‘n’, that contains alphabets. Implement the function to find and return the frequency of the letter, which has the highest frequency.
Assumption: String only contains lower case letters.
Note, Return -1 if str is null.

Format:
Input:
Input consists of a string s

Output:
This should be in the form of an integer that contains the highest frequency.


Example:
Input:
abcdaabcaba

Output:
5
 */