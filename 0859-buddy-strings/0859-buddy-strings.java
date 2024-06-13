class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            int []arr=new int[26];
            for(char ch1:s.toCharArray()){
                arr[ch1-'a']++;
                if(arr[ch1-'a']==2){
                    return true;
                }
            }
            return false;
        }
       ArrayList<Integer>list=new ArrayList<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=goal.charAt(i)){
            list.add(i);
            if(list.size()>2){
                return false;
            }
        }
       }
       return list.size() == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1)) && s.charAt(list.get(1)) == goal.charAt(list.get(0));

    }
}
