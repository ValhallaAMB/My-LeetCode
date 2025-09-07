class Solution:
    def intToRoman(self, num: int) -> str:
        count: int = 0
        res: List[str] = []
        value_symbols = {
            1000: "M", 900: "CM",
            500: "D", 400: "CD",
            100: "C", 90: "XC",
            50: "L", 40: "XL",
            10: "X", 9: "IX",
            5: "V", 4: "IV",
            1: "I",
        }
        
        if num == 0:
            return ""
        
        for key, value in value_symbols.items():
            if key <= num:
                count = num // key
                res.append(value * count)
                num -= count * key
            
        return ''.join(res)
