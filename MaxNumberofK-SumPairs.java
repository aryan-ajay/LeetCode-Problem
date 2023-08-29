// Question - 1679. Max Number of K-Sum Pairs

//   Example 1:

// Input: nums = [1,2,3,4], k = 5
// Output: 2
// Explanation: Starting with nums = [1,2,3,4]:
// - Remove numbers 1 and 4, then nums = [2,3]
// - Remove numbers 2 and 3, then nums = []
// There are no more pairs that sum up to 5, hence a total of 2 operations.
// Example 2:

// Input: nums = [3,1,3,4,3], k = 6
// Output: 1
// Explanation: Starting with nums = [3,1,3,4,3]:
// - Remove the first two 3's, then nums = [1,4,3]
// There are no more pairs that sum up to 6, hence a total of 1 operation.


class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int count = 0;

        while(i < j) {
            if(nums[i]+nums[j] == k) {
                count++;
                i++;
                j--;
            } else if(nums[i]+nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
