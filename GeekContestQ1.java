import java.util.*;
public class GeekContestQ1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        long ans=0, temp=0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    temp=(arr[i]-arr[j])*arr[k];
                    if(temp>ans)
                        ans=temp;
                }
            }
        }
        sc.close();
        System.out.println(ans);
    }
}

/*
 Given an array arr[ ] consisting of n integers, find the maximum Geek Value of the array to unleash its true potential. 
Geek value is defined as (arri - arrj) × arrk, where 1 ≤ i < j < k ≤ n.
Please note that if the Geek Value turns out to be negative, return 0 as the answer. 

Example 1:
Input :
n = 3
arr = {4,2,3}
Output:
6
Explanation:
We choose i=1,j=2,k=3 indices {one based indexing}
Geek value of array is (arr[i]-arr[j])*arr[k] = (4-2)*3 = 6.

Example 2:
Input :
n = 5
arr = {10,1,4,2,7}
Output:
63  
Explanation:
Take indices i=1,j=2 and k=5 {one based indexing} 
Geek value = (arr[1]−arr[2])×arr[5] = 63.
 */