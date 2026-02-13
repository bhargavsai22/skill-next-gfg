class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        for(int[]row:mat){
            if(Arrays.binarySearch(row,x)>=0){
                return true;
            }
        }
        return false; 
    }
}