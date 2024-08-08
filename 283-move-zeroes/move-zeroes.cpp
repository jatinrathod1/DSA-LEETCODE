class Solution {
public:
    // Moves Zeroes to end
    void moveZeroes(vector<int>& nums) {
        int j = 0;
        int n = nums.size();

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        // Fill the rest of the array with zeros
        while (j < n) {
            nums[j++] = 0;
        }
        for (int i = 0; i < nums.size(); i++) {
            cout << nums[i] << " ";
        }
    }
};