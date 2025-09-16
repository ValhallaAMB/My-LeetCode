class Solution:
    def numberOfMatches(self, n: int) -> int:
        # SOLUTION 1
        return n - 1

        # SOLUTION 2
        # matches: int = 0
        # while n > 1:
        #     if n % 2 == 0:
        #         n = n / 2
        #         matches += n
        #         print(n, matches)
        #     else:
        #         n = n // 2 + 1
        #         matches += n - 1
        #         print(n, matches)

        # return int(matches)

