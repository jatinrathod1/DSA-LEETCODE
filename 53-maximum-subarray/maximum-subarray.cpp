    //     int maxi = INT_MIN;
    //     int n = nums.size(); 

    // for (int i = 0; i < n; i++) {
    //     for (int j = i; j < n; j++) {
    //         int sum = 0;
    //         for (int k = i; k <= j; k++) {
    //             sum += nums[k];
    //         }
    //         maxi = max(maxi, sum);
    //     }
    // }

    // return maxi;
    // }
class Solution {
public:
 int maxSubArray(vector<int>& nums) {
    int maxSoFar = nums[0];
    int maxEndingHere = nums[0];

    for (int i = 1; i < nums.size(); i++) {
        maxEndingHere = max(nums[i], maxEndingHere + nums[i]);
        maxSoFar = max(maxSoFar, maxEndingHere);
    }

    return maxSoFar;
 }

};