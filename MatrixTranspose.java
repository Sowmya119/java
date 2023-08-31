import java.util.*;
public class MatrixTranspose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rowCount = sc.nextInt();
        int columnCount = sc.nextInt();
        int[][] matrix = new int[rowCount][columnCount];
        int[][] transpose = new int[columnCount][rowCount];
        for(int i=0; i<rowCount; i++) {
            for(int j=0; j<columnCount; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<columnCount; i++) {
            for(int j=0; j<rowCount; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        for(int[] row : transpose) {
            for(int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
Input (stdin)
2 3
2 3 4
5 6 4

Output (stdout)
2 5
3 6
4 4
 */