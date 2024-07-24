class Solution {
    public int minSwaps(String s) {
        int imbalance=0;
        int maxImbalance=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                imbalance--;
            }
            else{
                imbalance++;
            }
            maxImbalance=Math.max(imbalance,maxImbalance);
        }
        return (maxImbalance+1)/2;
    }
}