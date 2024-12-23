class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
            result = 0
            for i in range(32):
                # Shift the result to the left to make space
                result = (result << 1) | (n & 1)
                # Shift the input to the right to get the next bit
                n >>= 1
            return result
