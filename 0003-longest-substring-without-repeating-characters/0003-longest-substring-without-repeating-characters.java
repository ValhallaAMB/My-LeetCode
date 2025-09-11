class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int j = 0;

        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                while (hs.contains(s.charAt(i))) {
                    hs.remove(s.charAt(j));
                    j++;
                }
            }

            hs.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - j + 1);
        }

        return maxLength;
    }
}