class Solution {
    public String sortString(String s) {
        char [] arr=s.toCharArray();
        int []freq=new int[26];
        StringBuilder result=new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            freq[ch-'a']++;
        }
        while(result.length()<arr.length){
            for(int i=0;i<freq.length;i++){
                if(freq[i]>0){
                    result.append((char)(i+'a'));
                    freq[i]--;
                }
            }
            for(int i=25;i>=0;i--){
                if(freq[i]>0){
                    result.append((char)(i+'a'));
                    freq[i]--;
                }
            }
        }
        return result.toString();
    }
}