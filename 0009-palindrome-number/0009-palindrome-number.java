class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x!=0 && x%10==0){
            return false;
        }
        int palindrome=x;
        int reverse=0;
        while(palindrome!=0){
            int remainder=palindrome%10;
            reverse=reverse*10+remainder;
            palindrome=palindrome/10;
        }
        if(x==reverse){
            return true;
        }
           else{
               return false;
           }
    }
}