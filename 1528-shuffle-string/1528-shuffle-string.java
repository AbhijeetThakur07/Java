class Solution {
    public String restoreString(String s, int[] indices) {
       char[]arr=new char[s.length()];
     for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         int index=indices[i];
         arr[index]=ch;
     }
         return new String(arr);
    }
}