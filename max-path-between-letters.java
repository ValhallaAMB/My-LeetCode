/*

Maximize Path Between Letters:
Given a string s, return the max path you can get to move from one letter to another identical one in s. If there is no such a thing, return -1.

For example, if s = "abbbbba" , the path between the two a's is 5 (we
exclude the actual a's from the count).

Example: abcadeai
Input: s = "abcadeaj"
Output: 5

Constraints:
- 1 <= s.length <= 300
- s contains only lowercase English letters.

TEST CASES:
    Simple case:
    Input: s = "abbbbba"
    Expected output: 5

    There are multiple identical letters but spaced differently:
    Input: s = "abcadeai"
    Expected output: 5

    No identical letters appear twice:
    Input: s = "abcdefg"
    Expected output: -1

    Letters appear in pairs with equal spacing:
    Input: s = "aabbccdd"
    Expected output: 1 (max distance between first and last pair is 1 excluding the letters themselves)

    All letters are the same:
    Input: s = "aaaaaaa"
    Expected output: 5 (distance between first and last 'a' excluding both ends)

    Letters appear with some repetition in the middle:
    Input: s = "abcaabca"
    Expected output: 5 (distance between first and last 'a')

    Letters separated by only one character:
    Input: s = "abcdafgha"
    Expected output: 7 (distance between first and last 'a')

    Longer string with spaced identical letters:
    Input: s = "zxxxyzxxz"
    Expected output: 6 (distance between first and last 'z')

*/

import java.util.*;

public class Main {
  private static int solution(String s){
    int maxLength = -1;
    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    
    for (int i = 0; i < s.length(); i++){
      if (!hm.containsKey(s.charAt(i)))
        hm.put(s.charAt(i), i);
      else {
        hm.replace(s.charAt(i), i - hm.get(s.charAt(i)));
        maxLength = Math.max(maxLength, hm.get(s.charAt(i)));
      }
    }
    
    return maxLength - 1;
  }

  public static void main(String[] args) {
    System.out.println(solution("abcdefg"));
  }
}