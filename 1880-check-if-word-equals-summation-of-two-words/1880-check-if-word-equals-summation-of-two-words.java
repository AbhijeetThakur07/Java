class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstValue = wordToNumber(firstWord);  
        int secondValue = wordToNumber(secondWord);  
        int targetValue = wordToNumber(targetWord);  
        
        return firstValue + secondValue == targetValue; 
    }

    private int wordToNumber(String word) {
        int result = 0;
        for (char ch : word.toCharArray()) { 
            result = result * 10 + (ch - 'a');  
        }
        return result;
    }
}
