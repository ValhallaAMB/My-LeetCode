class Solution:
    def maxFreqSum(self, s: str) -> int:
        s_dict: [str, int] = {} 
        max_vow: int = 0
        max_con: int = 0

        for char in s:
            if char not in s_dict.keys():
                s_dict[char] = 1
            else:
                s_dict[char] = s_dict.get(char) + 1

            if char in "aeiou":
                max_vow = max(max_vow, s_dict.get(char))
            else:
                max_con = max(max_con, s_dict.get(char))
        
        return max_con + max_vow
