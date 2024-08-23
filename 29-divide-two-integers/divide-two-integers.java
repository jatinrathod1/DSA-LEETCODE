class Solution {
    public int divide(int dividend, int divisor) {
         // Handle edge cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Handle overflow case
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert both numbers to positive
        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);

        int quotient = 0;

        // Subtract divisor from dividend using bit manipulation
        while (dividendL >= divisorL) {
            long temp = divisorL, multiple = 1;

            // Double the divisor value while it is less than dividend
            while (dividendL >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest doubled divisor from the dividend
            dividendL -= temp;
            quotient += multiple;
        }

        // Apply the correct sign to the quotient
        return negative ? -quotient : quotient; 
    }
}