import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] originalIndices = new int[2];
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        int left = 0;
        int right = sortedNums.length - 1;

        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];

            if (sum == target) {
                // Find the original indices in the unsorted array
                originalIndices[0] = findIndex(nums, sortedNums[left]);
                originalIndices[1] = findIndex(nums, sortedNums[right]);
                return originalIndices;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // If no solution is found
        return new int[]{-1, -1};
    }

    private int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                // Mark the found element as Integer.MIN_VALUE to avoid reusing it
                array[i] = Integer.MIN_VALUE;
                return i;
            }
        }
        return -1;
    }
}
