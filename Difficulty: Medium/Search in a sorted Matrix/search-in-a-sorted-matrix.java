class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        int n=mat.length,m=mat[0].length,l=0,r=n*m-1;
        while(l<=r){
            int mid = (l+r)/2,val=mat[mid/m][mid%m];
            if(val==x) return true;
            if(val<x) l=mid+1;
            else r=mid-1;
        }
        return false;
    }
}