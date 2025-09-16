class Solution:
    def smallestRepunitDivByK(self, k: int) -> int:
        if k % 2 == 0 or k % 10 == 0 or k % 5 == 0:
            return -1
        
        res: int = 1 % k
        counter: int = 1
        while res != 0:
            res = (res * 10 + 1) % k
            counter+=1

        return counter