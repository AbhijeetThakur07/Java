class Solution {
    public String longestPalindrome(String s) {
        String res = "";

        for(int mid = 0; mid < s.length(); mid++){
            String odd = BigPalindrome(mid, mid, s);
            String even = BigPalindrome(mid, mid + 1, s);

            if(odd.length() > res.length())
                res = odd;
            if(even.length() > res.length())
                res = even;
        }
        return res;
    }
    public String BigPalindrome(int l, int r, String s){

        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}