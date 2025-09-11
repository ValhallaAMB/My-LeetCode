class Solution:
    def isPalindrome(self, x: int) -> bool:
        # Cannot be a palindrome if 0 
        if (x < 0):
            return False
            
        res: int = 0
        copyX: int = x

        while x > 0:
            # Save the resut in opposite order
            res = (res * 10) + (x % 10)
            x //= 10
            # print(res)

        return copyX == res
