import java.util.*;
public class PascalTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int[] lastRow = new int[rowNum];
        for(int i=0; i<=rowNum; i++) {
            int[] newRow = new int[i+1];
            newRow[0]=1;
            newRow[i]=1;
            if(i>1) {
                for(int j=1; j<i; j++) {
                    newRow[j] = lastRow[j] + lastRow[j-1];
                }
            }
            lastRow = newRow;
        }
        for(int j=0; j<lastRow.length; j++) {
                System.out.print(lastRow[j] + " ");
            }
        sc.close();
    }
}

/*
Sample Input 1:
5

Sample Output 1:
1 5 10 10 5 1



Sample Input 2:
3

Sample Output 2:
1 3 3 1
 */