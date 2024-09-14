class Solution {
    public String sortSentence(String s) {
        String[]arr=s.split(" ");
        String[]str=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            char lastChar=word.charAt(word.length()-1);
            int integerValue=lastChar-'0';
            
            str[integerValue-1]=word.substring(0,word.length()-1);
        }
        return String.join(" ",str);
    }
}