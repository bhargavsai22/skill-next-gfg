class Solution {
    public int romanToDecimal(String s) {
        // code here
        int n=s.length();
        int total=0;int prev=0;
          for(int i = n-1; i >= 0; i--){
            
            int curr = value(s.charAt(i));
            
            if(curr < prev)
                total -= curr;
            else
                total += curr;
            
            prev = curr;
        }
        
        return total;
    }
    
    int value(char ch){
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        if(ch == 'M') return 1000;
        return 0;
    }
}