//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int d = Integer.parseInt(read.readLine().trim());

            new Solution().leftRotate(nums, d);
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void leftRotate(int arr[], int d) {
        // code here
         if(arr.length==0||d==arr.length){
           return;
       }
       
       reverse(arr,0,d-1);
       reverse(arr,d,arr.length-1);
       
       reverse(arr,0,arr.length-1);
        
      
    }
    static void reverse(int[] arr,int s,int e){
        while(s<e){
            int val=arr[s];
            arr[s]=arr[e];
            arr[e]=val;
            s++;
            e--;
        }
        
    }


    
}
