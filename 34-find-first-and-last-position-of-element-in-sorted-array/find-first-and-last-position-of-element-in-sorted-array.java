class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        int left = findFirst(nums, target);
        if (left == nums.length || nums[left] != target) {
            return result;
        }
        
        result[0] = left;
        result[1] = findFirst(nums, target + 1) - 1;
        return result;
    }
    
    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}