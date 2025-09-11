class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int j = 0;

        // Used HashSet because order is not necessary 
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            // Check if our HashSet contains the letter
            if (hs.contains(s.charAt(i))) {
                // Repeat until the character has been removed
                while (hs.contains(s.charAt(i))) {
                    hs.remove(s.charAt(j));
                    j++;
                }
            }

            // Add to HashSet
            hs.add(s.charAt(i));
            // Calculate the max length
            maxLength = Math.max(maxLength, i - j + 1);
        }

        return maxLength;
    }
}