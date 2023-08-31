import java.util.*;
public class RunLengthEncoding {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = str.length();
        String answerStr = "";
        int charCount=1;
        for(int i=0; i<count; i=i+charCount) {
            charCount=1;
            for(int j=i+1; j<count;j++) {
                if(str.charAt(i)==str.charAt(j))
                charCount++;
                else
                break;
            }
            if(charCount>1)
                answerStr += charCount + String.format("%c", str.charAt(i));
            else
                answerStr += str.charAt(i);
        }
        System.out.println(answerStr);
        sc.close();
    }
}

/*Implement run-length encoding. Run-length encoding (RLE) is a simple form of data compression, where runs (consecutive data elements) are replaced by just one data value and count.
"WWBWWWBBBWWWWB" -> "2WB3W3B4WB"

Write a program for this to encode the characters.

Sample Input1:
"WWBWWWBBBWWWWB"

Sample Output1:
2WB3W3B4WB

 */