/*

This is a Java program that counts the number of pairs in an array of integers.
If the array contains an odd number of any integers or pairs, it returns 0.
So the array must have an even count of each integer to form pairs.

 */

import java.util.*;

public class Main {
    private static int solution (int[] k){
      int pairs = 0;

      Map<Integer, Integer> counts = new HashMap<>();

       if (k.length % 2 != 0)
          return 0;        
      
      for (int num : k) {
        if (counts.containsKey(num))
          counts.replace(num, counts.get(num) + 1);
        else 
          counts.put(num, 1);
      }
      
      // System.out.println(counts);

      for (int count : counts.values()) {
        if (count % 2 != 0)
          return 0;
        
        while (count / 2 > 0){
          pairs += count / 2;
          count = count / 2;
        }
      }
      
      return pairs;
    }
  
    public static void main(String[] args) {
        int[] k = {5, 8, 5, 8, 8, 8};
        int pairs = solution(k);

        System.out.println("Number of pairs: " + pairs);
  }
}