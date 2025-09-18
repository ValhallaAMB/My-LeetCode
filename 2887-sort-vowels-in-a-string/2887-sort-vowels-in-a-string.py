class Solution:
    def sortVowels(self, s: str) -> str:
        # Result string
        res_s: list = list(s)
        # Move all vowels to list 
        vowels: list = [c for c in res_s if c in "AEIOUaeiou"]
        
        # Return if empty
        if vowels == []:
            return s

        # Ensure list is in ASCII order
        vowels.sort()
        # index acts as a counter
        index: int = 0

        for i in range(len(s)):
            # Reassign the vowels in the correct order 
            if res_s[i] in "AEIOUaeiou":
                res_s[i] = vowels[index]
                index+=1

        return ''.join(res_s)