public class Solution {
    public String longestPalindrome(String s) {
        // Cannot be palindrome if string length <= 1
        if (s.length() <= 1) {
            return s;
        }

        String palStr = "";

        for (int i = 0; i < s.length() - 1; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            // Check for the longest palindrome 
            if (odd.length() > palStr.length()) {
                palStr = odd;
            }
            if (even.length() > palStr.length()) {
                palStr = even;
            }
        }

        return palStr;
    }

    private String expandFromCenter(String s, int left, int right) {
        // Checks if the letters are the same from both sides 
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
