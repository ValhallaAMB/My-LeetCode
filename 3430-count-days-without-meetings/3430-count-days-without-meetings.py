class Solution:
    def countDays(self, days: int, meetings: List[List[int]]) -> int:
        # Sort the list
        meetings.sort()
        prevEnd = 0

        for start, end in meetings:
            # Skip iteration if the same distance
            if (prevEnd < end):
                # Start from the last end point
                start = max(start, prevEnd + 1)
                # Number of meeting days
                length = end - start + 1
                # Deduct the length
                days -= length
                # Assign the last largest number
                prevEnd = max(prevEnd, end)

        return days
