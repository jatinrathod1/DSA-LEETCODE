class Solution {
    public int divide(int dividend, int divisor) {
        // Handle special cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Sign of the result
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        // Convert dividend and divisor to positive
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int quotient = 0;
        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            int i = 1;
            // Repeatedly divide the divisor by 2 and check if it can be subtracted from the
            // current dividend
            while ((temp << 1) <= absDividend) {
                temp <<= 1;
                i <<= 1;
            }
            // Subtract the divisor from the dividend and update the quotient
            absDividend -= temp;
            quotient += i;
        }

        // Check for overflow
        if (quotient > Integer.MAX_VALUE) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return sign * quotient;
    }
};