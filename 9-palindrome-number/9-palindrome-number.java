class Solution {
    public boolean isPalindrome(int x) {
        int rev =0;
        int temp=x;
        while(x>0){
            rev=rev*10+x%10;
            x=x/10;
            
        }
        System.out.println("rev"+rev);
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }
    }
}