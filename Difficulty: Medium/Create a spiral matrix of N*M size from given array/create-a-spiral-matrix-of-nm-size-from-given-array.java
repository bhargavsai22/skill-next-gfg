// User function Template for Java

import java.util.*;

class Solution {
    public static int[][] spiralFill(int n, int m, int[] arr) {
        int[][] res = new int[n][m];

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        int k = 0; 

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right && k < arr.length; i++) {
                res[top][i] = arr[k++];
            }
            top++;
            for (int i = top; i <= bottom && k < arr.length; i++) {
                res[i][right] = arr[k++];
            }
            right--;
            for (int i = right; i >= left && k < arr.length; i--) {
                res[bottom][i] = arr[k++];
            }
            bottom--;
            for (int i = bottom; i >= top && k < arr.length; i--) {
                res[i][left] = arr[k++];
            }
            left++;
        }

        return res;
    }
}
