class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pairCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                continue;
            }
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    pairCount++;
                    nums[i] = -1;
                    nums[j] = -1;
                    break;
                }
            }
        }
        int leftOverCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                leftOverCount++;
            }
        }
        return new int[] { pairCount, leftOverCount };
    }
}