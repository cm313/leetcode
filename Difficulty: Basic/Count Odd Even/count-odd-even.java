//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] S = br.readLine().trim().split(" ");
            int n = S.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] result = obj.countOddEven(arr);
            for (Integer t : result) {
                System.out.print(t + " ");
            }
            System.out.println(" ");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int len = arr.length;
        int even=0, odd=0;
        int res[] = new int[2];
        for(int i=0; i<len; i++){
            int num = arr[i];
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        res[0]=odd;
        res[1]=even;
        return res;
    }
}