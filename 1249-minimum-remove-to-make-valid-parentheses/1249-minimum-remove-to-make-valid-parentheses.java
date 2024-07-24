class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(); // To store the valid sequence
        int opened = 0; // Count of unmatched '('

        // Forward pass to handle ')' and keep unmatched '(' count
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                opened++; // Increase open count
            } else if (ch == ')') {
                if (opened > 0) {
                    opened--; // Decrease open count if we have unmatched '('
                } else {
                    continue; // Skip unmatched ')'
                }
            }
            sb.append(ch); // Append the current character
        }

        // Backward pass to remove unmatched '('
        for (int i = sb.length() - 1; i >= 0 && opened > 0; i--) {
            if (sb.charAt(i) == '(') {
                sb.deleteCharAt(i); // Remove unmatched '('
                opened--; // Decrease open count
            }
        }

        return sb.toString(); // Return the valid string
    }
}
