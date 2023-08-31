import java.util.*;
public class PatternPrinting6 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int length=(2*count)-1;
        for(int i=count; i<=length; i++) {
            for(int j=1; j<=length; j++) {
                if(j>=count-(length-i) && j<=count+(length-i))
                    System.out.print("*" + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*4

Output (stdout)
* * * * * * *
  * * * * *
    * * *
      *
      
      
      */