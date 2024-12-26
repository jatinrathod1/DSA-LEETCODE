class Solution(object):
    def fib(self, n):
        if n==1:
            return 1
        elif n==2:
            return 1
        n0=1
        n1=1
        ans = 0
        for i in range(2,n):
            ans=n0+n1
            n0 = n1
            n1 = ans
        return ans
