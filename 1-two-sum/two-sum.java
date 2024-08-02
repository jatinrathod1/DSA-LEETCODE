class Solution {
    public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            int complete = target - nums[j];
            if(map.containsKey(complete))
            {
                return new int[]{j , map.get(complete)};
            }
            map.put(nums[j], j);
        }    
        throw new IllegalArgumentException("error");
    
    }
    
};