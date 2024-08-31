class Solution {
    public int[] evenOddBit(int n) {
        int[] counts = new int[2]; // 0 for even, 1 for odd
        int index = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                counts[index % 2]++;
            }
            index++;
            n >>= 1;
        }

        return counts;
    }
}