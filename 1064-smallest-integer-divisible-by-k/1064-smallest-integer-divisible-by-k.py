class Solution:
    def smallestRepunitDivByK(self, k: int) -> int:
        # Cases that'll never work
        if k % 2 == 0 or k % 10 == 0 or k % 5 == 0:
            return -1
        
        calculation: int = 1 % k
        counter: int = 1

        # Perform calculation until the answer is found
        while calculation != 0:
            calculation = (calculation * 10 + 1) % k
            counter += 1

        return counter
