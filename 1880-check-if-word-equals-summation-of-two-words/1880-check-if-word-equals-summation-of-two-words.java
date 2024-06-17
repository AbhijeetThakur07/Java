class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstValue = wordToNumber(firstWord);
        int secondValue = wordToNumber(secondWord);
        int targetValue = wordToNumber(targetWord);
        
        return firstValue + secondValue == targetValue;
    }

    public int wordToNumber(String word) {
        StringBuilder numStr = new StringBuilder();
        for (char ch : word.toCharArray()) {
            numStr.append(ch - 'a');
        }
        return Integer.parseInt(numStr.toString());
    }
}
