class Solution:
    def isPalindrome(self, x: int) -> bool:
        if (x < 0):
            return False
            
        res: int = 0
        copyX: int = x

        while x > 0:
            res = (res * 10) + (x % 10)
            x //= 10
            print(res)
            
        return copyX == res
