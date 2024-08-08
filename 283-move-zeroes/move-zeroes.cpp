class Solution {
public:
    // Moves Zeroes to end
    void moveZeroes(vector<int>& nums) {
       int j = 0; // Position to place the next non-zero element

    for (int i = 0; i < nums.size(); i++)
    {
        if (nums[i] != 0)
        {
            if (i != j)
            {
                // Swap the current non-zero element with the element at index j
                swap(nums[i], nums[j]);
            }
            j++; // Move the pointer for non-zero placement
        }
    }
        for (int i = 0; i < nums.size(); i++) {
            cout << nums[i] << " ";
        }
    }
};