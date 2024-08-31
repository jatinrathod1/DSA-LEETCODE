class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int first = nums[nums.length - 1], second = nums[0], third = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < first && nums[i] > second && nums[i] > third) {
                third = second;
                second = nums[i];
            }
        }
        return (nums[0] == second)? first : third;
    }
}