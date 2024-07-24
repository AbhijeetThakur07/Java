class Solution {
    public int minAddToMakeValid(String s) {
        int opened=0;
        int closed=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c=='('){
                opened++;
            }
            else if(c==')'){
                if(opened>0){
                    opened--;
                }
                else{
                 closed++;   
                }
                
            }
        }
       return opened+closed;
    }
   
}