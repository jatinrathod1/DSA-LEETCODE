class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int k = 0; // Pointer for non-val elements
        
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Overwrite non-val element at index k
                k++; // Increment k for next non-val element
            }
        }
        
        return k; // Return the new length of the array
    }
};
