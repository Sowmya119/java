import java.util.*;
public class AddNumberStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] nums = new String[count];
        int maxLength=0, finalSum=0, carry=0, indexer=1;
        for(int i=0; i<count; i++) {
            nums[i] = sc.next();
        }
        for(int i=0; i<count; i++) {
            if(nums[i].length() > maxLength)
                maxLength = nums[i].length();
        }
        for(int i=0; i<maxLength; i++) {
            int colSum=0;
            for(int j=0; j<count; j++) {
                if(nums[j].length()-indexer>=0)
                    colSum += nums[j].charAt(nums[j].length()-indexer) - 48;
            }
            colSum += carry;
            carry = colSum/10;
            finalSum += (colSum%10 * (int) Math.pow(10, i));
            indexer++;
        }
        finalSum += carry * (int) Math.pow(10,maxLength);
        System.out.println(finalSum);
        sc.close();
    }
}

/*
import java.util.*;
public class AddNumberStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] nums = new String[count];
        int maxLength=0;
        for(int i=0; i<count; i++) {
            nums[i] = sc.next();
        }
        for(int i=0; i<count; i++) {
            if(nums[i].length() > maxLength)
                maxLength = nums[i].length();
        }
        int[] colSum = new int[maxLength];
        int indexer=1;
        int carry=0, tenPower=0, finalSum=0;
        for(int i=maxLength-1; i>=0; i--) {
            for(int j=0; j<count; j++) {
                if(nums[j].length() - indexer >= 0)
                    colSum[i] += nums[j].charAt(nums[j].length()-indexer)-48;
            }
            indexer++;
        }
        for(int i=maxLength-1; i>=0; i--) {
            if(i<maxLength-1) {
                carry = colSum[i+1]/10;
            }
            colSum[i] += carry;
            finalSum += (colSum[i]%10 * (int) Math.pow(10, tenPower));
            tenPower++;
        }
        finalSum += carry * (int) Math.pow(10, maxLength);
        System.out.println(finalSum);
        sc.close();
    }
}
*/