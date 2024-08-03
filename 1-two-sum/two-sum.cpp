class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> map;
        for (int j = 0; j < nums.size(); j++) {
            int complete = target - nums[j];
            if (map.find(complete) != map.end()) {
                return {j, map[complete]};
            }
            map[nums[j]] = j;
        }
        throw invalid_argument("error");
    }
    
};