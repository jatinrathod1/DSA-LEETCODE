class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        if (n < 1)
            return output;

        int product = 1;
        for (int i = 0; i < n; ++i) {
            product *= nums[i];
            output[i] = product;
        }

        // Traverse from right and update output array
        product = 1;
        for (int i = n - 1; i > 0; --i) {
            output[i] = output[i - 1] * product;
            product *= nums[i];
        }
        output[0] = product;

        return output;

    }
}