class Solution {
    public void reverseString(char[] s) {
       int l= s.length-1;
        char t;
        int f=0;
        while(f<l){
            t=s[l];
            s[l]=s[f];
            s[f]=t;
            l--;
            f++;
        }
        
        
        
        
        }
        
    }
