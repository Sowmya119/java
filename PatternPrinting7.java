import java.util.*;
public class PatternPrinting7 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int rowCount=sc.nextInt();
        int colCount=sc.nextInt();
        int[][] numArray=new int[rowCount][colCount];
        for(int i=0; i<rowCount; i++) {
            for(int j=0; j<colCount; j++) {
                numArray[i][j]=sc.nextInt();
            }
        }
        int i=0, j=0;
        while(i<rowCount) {
            while(j<colCount) {
                System.out.print(numArray[i][j] + " ");
                j++;
            }
            for(int m=0; m<rowCount; m++) {
                System.out.print(numArray[m][j-1] + " ");
            }
        }
        sc.close();
    }
}


/*
 Input (stdin)
3 6
1 2 3 4 5 6
7 8 9 10 11 12
13 14 15 16 17 18

Output (stdout)
1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
 */

/*
 import java.util.*;
public class PatternPrinting7 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int rowCount=sc.nextInt();
        int colCount=sc.nextInt();
        int[][] numArray=new int[rowCount][colCount];
        for(int i=0; i<rowCount; i++) {
            for(int j=0; j<colCount; j++) {
                numArray[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<colCount; i++) {
            System.out.print(numArray[0][i] + " ");
        }
        for(int i=1; i<rowCount; i++) {
            System.out.print(numArray[i][colCount-1] + " ");
        }
        for(int i=rowCount-1; i>0; i--) {
            if(i%2==0) {
                for(int j=colCount-2; j>=0; j--) {
                    System.out.print(numArray[i][j] + " ");
                }
            }
            else {
                for(int j=0; j<colCount-1; j++) {
                    System.out.print(numArray[i][j] + " ");
                }
            }
        }
        sc.close();
    }
}
 */