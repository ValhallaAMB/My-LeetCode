class Solution:
    def maxArea(self, height: List[int]) -> int:
        l: int = 0
        r: int = len(height) - 1
        temp_result: int = 0
        final_result: int = 0
        
        while l != r:
            if height[l] < height[r]:
                small_num = height[l]
                l += 1
            else:
                small_num = height[r]
                r -= 1
                
            distance = r - l + 1
            temp_result = distance * small_num
            
            final_result = temp_result if temp_result > final_result else final_result

        return final_result