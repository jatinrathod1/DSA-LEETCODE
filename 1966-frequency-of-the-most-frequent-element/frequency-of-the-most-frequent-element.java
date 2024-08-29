class Solution {
    public int maxFrequency(int[] nums, int k) {
         Arrays.sort(nums);
        int n = nums.length;
        int maxFrequency = 1;
        int left = 0;
        long totalOperations = 0;

        for (int right = 1; right < n; right++) {
            totalOperations += (long) (nums[right] - nums[right - 1]) * (right - left);

            // Shrink the window if the operations exceed k
            while (totalOperations > k) {
                totalOperations -= nums[right] - nums[left];
                left++;
            }

            // Update the maximum frequency
            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }

        return maxFrequency;
    }
}