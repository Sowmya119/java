import java.util.*;
public class SumStringFromNumberString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] numArray = new String[count];
        for(int i=0; i<count; i++) {
            numArray[i]=sc.next();
        }
        int maxLength=0;
        for(int i=0; i<count; i++) {
            if(numArray[i].length()>maxLength)
                maxLength=numArray[i].length();
        }
        String sumString="";
        int carry=0, indexer=1;
        for(int i=0; i<maxLength; i++) {
            int colSum=0;
            for(int j=0; j<count; j++) {
                if(numArray[j].length()-indexer>=0)
                    colSum += numArray[j].charAt(numArray[j].length()-indexer)-48;
            }
            indexer++;
            colSum += carry;
            carry = colSum/10;
            colSum = colSum%10;
            sumString = colSum+sumString;
        }
        if(carry>0)
            sumString = carry+sumString;
        System.out.println(sumString);
        sc.close();
    }
}
