class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> Mp = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Mp.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (Mp.containsKey(complement) && Mp.get(complement) != i) {
                return new int[]{ i, Mp.get(complement)};
            }
        }

        return new int[]{}; 
    }
}