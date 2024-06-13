class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        from math import ceil
        if divisor==dividend:
            return 1
        if divisor==-dividend:
            return -1
        if divisor==1:
            return dividend
        if divisor==-1:
            return -dividend
        n=int()
        neg=dividend<0
        neg_div=divisor<0
        if neg_div:
            divisor=-divisor
        while abs(dividend)>=divisor:
            if not neg:
                dividend-=divisor
                n+=1
            else:
                dividend+=divisor
                n+=1
        if neg_div ^ neg:
            return ceil(-n)
        return n

dv=-2147483648
ds=-1
print(Solution().divide(dv,ds))